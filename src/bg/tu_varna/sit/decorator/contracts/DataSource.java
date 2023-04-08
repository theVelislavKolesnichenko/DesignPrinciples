package bg.tu_varna.sit.decorator.contracts;

import java.io.IOException;

public interface DataSource {
    void writeData(String data) throws IOException;
    String readData();
}
