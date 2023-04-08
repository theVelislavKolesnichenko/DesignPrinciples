package bg.tu_varna.sit.bridge.models;

import bg.tu_varna.sit.bridge.contrcts.Device;

public class Radio implements Device {
    private boolean on = false;
    private int volume = 30;
    private int channel = 1;

    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public void enable() {
        on = true;
    }

    @Override
    public void disable() {
        on = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        if (volume > 100) {
            this.volume = 100;
        } else if (volume < 0) {
            this.volume = 0;
        } else {
            this.volume = volume;
        }
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public String getStatus() {
        StringBuilder builder = new StringBuilder();
        builder.append("------------------------------------");
        builder.append("| I'm radio.");
        builder.append("| I'm " + (on ? "enabled" : "disabled"));
        builder.append("| Current volume is " + volume + "%");
        builder.append("| Current channel is " + channel);
        builder.append("------------------------------------\n");
        return builder.toString();
    }
}
