module uk.calebwhiting.tk.annotation.processor {

    requires java.compiler;

    requires uk.calebwhiting.tk.annotations;

    exports uk.calebwhiting.tk.annotation;

    // provides javax.annotation.processing.Processor with uk.calebwhiting.tk.annotation.TkProcessor;

}
