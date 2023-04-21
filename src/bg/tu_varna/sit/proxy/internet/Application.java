package bg.tu_varna.sit.proxy.internet;

import bg.tu_varna.sit.proxy.internet.proxy_servises.ProxyInternet;
import bg.tu_varna.sit.proxy.internet.servises.RealInternet;

public class Application {
    public static void main (String[] args)
    {
        ProxyInternet internet = new ProxyInternet(new RealInternet());
        internet.addBannedSites("abc.com");
        internet.addBannedSites("def.com");
        internet.addBannedSites("ijk.com");
        internet.addBannedSites("lnm.com");

        try
        {
            System.out.println(internet.connectTo("sit.tu-varna.bg"));
            System.out.println(internet.connectTo("abc.com"));
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
