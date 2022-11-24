package se1.hu3.factory;

public class GamingMonitor extends Monitor{

    public GamingMonitor(int refreshRate, double size, Resolution resolution) {
        super(refreshRate, size, resolution);
    }

    @Override
    public String getMonitorType() {
        return "Gaming Monitors are the best";
    }
}
