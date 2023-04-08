package bg.tu_varna.sit.decorator.logger;

import java.io.IOException;

public interface Logger {
    void log(String message) throws IOException;
}
