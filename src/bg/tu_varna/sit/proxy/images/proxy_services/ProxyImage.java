package bg.tu_varna.sit.proxy.images.proxy_services;

import bg.tu_varna.sit.proxy.images.servises.ConsoleImage;
import bg.tu_varna.sit.proxy.images.servises.Image;

public class ProxyImage implements Image {
    private ConsoleImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new ConsoleImage(fileName);
        }
        realImage.display();
    }
}
