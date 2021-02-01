package uk.calebwhiting.tk.annotation;

import uk.calebwhiting.tk.annotations.Plugin;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.lang.model.type.TypeMirror;
import javax.tools.FileObject;
import javax.tools.StandardLocation;
import java.io.IOException;
import java.io.Writer;
import java.util.Set;

@SupportedOptions({})
@SupportedAnnotationTypes({
        "uk.calebwhiting.tk.annotations.Plugin"
})
@SupportedSourceVersion(SourceVersion.RELEASE_0)
public class TkProcessor extends AbstractProcessor {

    private int phase = 0;

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        if (phase++ > 0)
            return false;
        try {
            writeTkPlugins(roundEnv);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }

    private void writeTkPlugins(RoundEnvironment roundEnv) throws IOException {
        FileObject resource = processingEnv.getFiler().createResource(
                StandardLocation.CLASS_OUTPUT, "", "META-INF/tk-plugins");
        try (Writer w = resource.openWriter()) {
            String[] plugins = roundEnv.getElementsAnnotatedWith(Plugin.class)
                    .stream()
                    .map(Element::asType)
                    .map(TypeMirror::toString)
                    .toArray(String[]::new);
            for (String plugin : plugins) {
                w.write(plugin);
                w.write('\n');
            }
        }
    }

}
