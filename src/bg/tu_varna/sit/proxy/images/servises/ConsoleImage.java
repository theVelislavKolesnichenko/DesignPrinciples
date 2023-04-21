package bg.tu_varna.sit.proxy.images.servises;

public class ConsoleImage implements Image {

    private String fileName;

    public ConsoleImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }
}
