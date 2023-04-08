package bg.tu_varna.sit.decorator.logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class ErrorLogger implements Logger {

    private static Logger logger;

    private ErrorLogger() {}

    public static Logger getLogger() {
        if(logger == null) {
            logger = new ErrorLogger();
        }
        return logger;
    }

    public void log(String message) throws IOException {
        Files.write(
                Path.of("LocalErrors.txt"), String.format("%s\n",message).getBytes(),
                StandardOpenOption.APPEND);
    }
}
