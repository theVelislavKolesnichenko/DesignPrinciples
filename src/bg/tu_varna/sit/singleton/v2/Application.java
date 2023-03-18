package bg.tu_varna.sit.singleton.v2;

public class Application {
    public static void main(String[] args) {

        StaticBlockSingleton.getInstance().open();
        StaticBlockSingleton.getInstance().save("message");
    }
}
