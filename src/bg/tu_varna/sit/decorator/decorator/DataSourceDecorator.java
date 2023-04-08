package bg.tu_varna.sit.decorator.decorator;

import bg.tu_varna.sit.decorator.contracts.DataSource;

import java.io.IOException;

public class DataSourceDecorator implements DataSource {
    private DataSource wrappee;

    DataSourceDecorator(DataSource source) {
        this.wrappee = source;
    }

    @Override
    public void writeData(String data) throws IOException {
        wrappee.writeData(data);
    }

    @Override
    public String readData() {
        return wrappee.readData();
    }
}
