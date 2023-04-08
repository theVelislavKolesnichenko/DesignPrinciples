package bg.tu_varna.sit.decorator;

import bg.tu_varna.sit.decorator.contracts.DataSource;
import bg.tu_varna.sit.decorator.decorator.CompressionDecorator;
import bg.tu_varna.sit.decorator.decorator.DataSourceDecorator;
import bg.tu_varna.sit.decorator.decorator.EncryptionDecorator;
import bg.tu_varna.sit.decorator.files.FileDataSource;
import bg.tu_varna.sit.decorator.logger.ErrorLogger;
import bg.tu_varna.sit.decorator.logger.Logger;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        String students = "Name,Number\nИжав Иванов,22651548\nИвана Иванова,22651549";

        DataSource source = new FileDataSource(
                "out/student.csv",
                ErrorLogger.getLogger());
        //source.writeData(students);

        DataSource  encryption = new EncryptionDecorator(source);
        //encryption.writeData(students);
        DataSourceDecorator encoded = new CompressionDecorator(encryption);
        encoded.writeData(students);

        DataSource plain = new FileDataSource("out/student.csv", ErrorLogger.getLogger());
        DataSource encryption1 = new EncryptionDecorator(plain);
        DataSource encoded1 = new CompressionDecorator(encryption1);

        System.out.println("Input");
        System.out.println(students);
        System.out.println("Encoded");
        System.out.println(plain.readData());
//        System.out.println("Source");
//        System.out.println(source.readData());
        //System.out.println("Decoded");
        //System.out.println(encryption.readData());
        System.out.println("Decoded 0");
        System.out.println(encoded.readData());
        //System.out.println("Decoded 1");
        //System.out.println(encoded1.readData());
    }
}
