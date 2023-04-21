package bg.tu_varna.sit.proxy.internet.servises;

public class RealInternet implements Internet {
    @Override
    public String connectTo(String serverHost) throws Exception {
        return "Connecting to "+ serverHost;
    }
}
