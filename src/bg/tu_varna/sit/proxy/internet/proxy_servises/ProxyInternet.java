package bg.tu_varna.sit.proxy.internet.proxy_servises;

import bg.tu_varna.sit.proxy.internet.servises.Internet;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {

    private Internet internet;
    private List<String> bannedSites;

    public ProxyInternet(Internet internet) {
        this.internet = internet;
        bannedSites = new ArrayList<>();
    }

    public void addBannedSites(String bannedSite) {
        this.bannedSites.add(bannedSite);
    }

    @Override
    public String connectTo(String serverHost) throws Exception {
        if(bannedSites.contains(serverHost.toLowerCase()))
        {
            throw new Exception("Access Denied");
        }

        return internet.connectTo(serverHost);
    }
}
