package bg.tu_varna.sit.decorator.files;

import bg.tu_varna.sit.decorator.contracts.DataSource;
import bg.tu_varna.sit.decorator.logger.Logger;

import java.io.*;

public class FileDataSource implements DataSource {
    private String name;
    private Logger logger;

    public FileDataSource(String name, Logger logger) {
        this.name = name;
        this.logger = logger;
    }

    @Override
    public void writeData(String data) throws IOException {
        File file = new File(name);
        try (OutputStream fos = new FileOutputStream(file)) {
            fos.write(data.getBytes(), 0, data.length());
        } catch (IOException ex) {
            this.logger.log(ex.getMessage());
        }
    }

    @Override
    public String readData() {
        char[] buffer = null;
        File file = new File(name);
        try (FileReader reader = new FileReader(file)) {
            buffer = new char[(int) file.length()];
            reader.read(buffer);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return new String(buffer);
    }
}
