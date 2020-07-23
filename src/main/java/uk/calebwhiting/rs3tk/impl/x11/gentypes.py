#!/usr/bin/env python3
#
# Generates XcbTypes.java
#
import os
import re
from xml import sax


def to_class_name(name: str):
    if name in ["int", "long", "short", "byte", "float", "double", "char"]:
        return name
    if re.fullmatch("^[A-Z][A-Za-z0-9]*$", name):
        # name is already fine :)
        return name
    for bits in [8, 16, 24, 32, 64]:
        if name == f'uint{bits}_t':
            return f"UInt{bits}"
        if name == f'int{bits}_t':
            return f"Int{bits}"
    name = name[4:] if name.startswith("xcb_") else name
    name = name[:-2] if name.endswith("_t") else name
    return "".join([s.capitalize() for s in name.split('_')])


class XmlTypesHandler(sax.handler.ContentHandler):
    path = list()
    class_name: str
    fields = list()

    def write_class(self):
        def quote(s):
            return '"%s"' % s

        # print(f'    class {self.class_name}p extends {self.class_name} implements ByReference {{}}')
        if len(self.fields) == 0:
            print(f"    class {self.class_name} {{\n"
                  f"        public static class ByReference extends {self.class_name}\n"
                  f"            implements Structure.ByReference {{}}\n"
                  f"        public static class ByValue extends {self.class_name}\n"
                  f"            implements Structure.ByValue {{}}\n"
                  f"    }}", file=java)
            return

        print(f'    @FieldOrder({{{", ".join([quote(x[0]) for x in self.fields])}}})\n'
              f'    class {self.class_name} extends Structure {{', file=java)
        for f_name, f_type, f_array_length in self.fields:
            if f_array_length:
                print(f'        public {f_type}[] {f_name} = new {f_type}[{f_array_length}]; \n', file=java)
            else:
                print(f'        public {f_type} {f_name};', file=java)
        print(f"        public static class ByReference extends {self.class_name}\n"
              f"            implements Structure.ByReference {{}}\n"
              f"        public static class ByValue extends {self.class_name}\n"
              f"            implements Structure.ByValue {{}}", file=java)
        print('    }', file=java)

    @staticmethod
    def write_alias(class_name, of):
        # print(f'    class {class_name}p extends {class_name} implements ByReference {{ }}', file=java)
        print(f'    class {class_name} extends {of} {{\n'
              f'        public static class ByReference extends {class_name}\n'
              f'            implements Structure.ByReference {{}}\n'
              f'        public static class ByValue extends {class_name}\n'
              f'            implements Structure.ByValue {{}}\n'
              f'    }}', file=java)

    def __init__(self):
        super().__init__()

    def startDocument(self):
        print(f'package uk.calebwhiting.rs3tk.impl.x11;\n'
              f'\n'
              f'import static uk.calebwhiting.rs3tk.impl.x11.CTypes.*;\n'
              f'\n'
              f'import com.sun.jna.*;\n'
              f'import com.sun.jna.Structure.*;\n'
              f'\n'
              f'@SuppressWarnings("unused")\n'
              f"public interface XcbTypes {{", file=java)
        super().startDocument()

    def endDocument(self):
        print("}", file=java)
        super().endDocument()

    def startPrefixMapping(self, prefix, uri):
        print("start-prefix-mapping, prefix=", prefix, ", uri=", uri, sep='')
        super().startPrefixMapping(prefix, uri)

    def endPrefixMapping(self, prefix):
        print("// end-prefix-mapping, prefix=", prefix, sep='')
        super().endPrefixMapping(prefix)

    def startElement(self, name: str, attrs: sax.xmlreader.AttributesImpl):
        self.path.append(name)
        if ".".join(self.path[:-1]) == "xcb.types":
            self.class_name = to_class_name(name)
            self.fields.clear()
        if ".".join(self.path) == "xcb.aliases.alias":
            self.write_alias(to_class_name(attrs.get("class")), to_class_name(attrs.get("of")))
        if ".".join(self.path[:-2]) == "xcb.types":
            assert name == 'field'
            f_name = attrs.get("name")
            f_type = attrs.get("type")
            f_array_len = attrs.get("len")
            self.fields.append((f_name, to_class_name(f_type), f_array_len))
        super().startElement(name, attrs)

    def endElement(self, name):
        assert self.path[-1] == name
        path = ".".join(self.path[:-1])
        if path == "xcb.types":
            self.write_class()
        super().endElement(name)
        self.path.pop()

    def startElementNS(self, name, qname, attrs):
        print("// end-element-ns, name=", name, ", qname=", qname, ", attrs=", attrs.items(), sep='')
        super().startElementNS(name, qname, attrs)

    def endElementNS(self, name, qname):
        print("// end-element-ns, name=", name, ", qname=", qname, sep='')
        super().endElementNS(name, qname)

    def characters(self, content):
        if len(content.strip()) == 0:
            return
        print("// characters, ", content, sep='')
        super().characters(content)

    def ignorableWhitespace(self, whitespace):
        super().ignorableWhitespace(whitespace)

    def processingInstruction(self, target, data):
        super().processingInstruction(target, data)

    def skippedEntity(self, name):
        super().skippedEntity(name)


if not os.path.exists('XcbTypes.xml'):
    raise FileNotFoundError()

with open('XcbTypes.java', 'w') as java:
    # java = sys.stdout
    with open('XcbTypes.xml', 'r') as xml_input:
        sax.parse(xml_input, XmlTypesHandler())
