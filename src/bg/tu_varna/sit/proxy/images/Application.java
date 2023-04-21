package bg.tu_varna.sit.proxy.images;

import bg.tu_varna.sit.proxy.images.proxy_services.ProxyImage;
import bg.tu_varna.sit.proxy.images.servises.Image;

public class Application {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");
        image.display();
        image.display();
    }
}
