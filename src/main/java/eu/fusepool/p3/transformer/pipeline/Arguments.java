package eu.fusepool.p3.transformer.pipeline;

import org.wymiwyg.commons.util.arguments.ArgumentsWithHelp;
import org.wymiwyg.commons.util.arguments.CommandLine;

public interface Arguments extends ArgumentsWithHelp {

    @CommandLine(longName = "port", shortName = {"P"}, required = false,
            defaultValue = "8300",
            description = "The port on which the transformer shall listen")
    public int getPort();

    @CommandLine(longName = "enableCors", shortName = {"C"},
            description = "Enable a liberal CORS policy",
            isSwitch = true)
    public boolean enableCors();
}
