package se1.hu3.factory;

public class OfficeMonitor extends Monitor{
    public OfficeMonitor(int refreshRate, double size, Resolution resolution) {
        super(refreshRate, size, resolution);
    }

    @Override
    public String getMonitorType() {
        return "Office Monitors are the best";
    }

}
