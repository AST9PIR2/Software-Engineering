package se1.hu3.factory;

public class DesignMonitor extends Monitor {

    public DesignMonitor(int refreshRate, double size, Resolution resolution) {
        super(refreshRate, size, resolution);
    }

    @Override
    public String getMonitorType() {
        return "Designer Monitors are the best";
    }
}
