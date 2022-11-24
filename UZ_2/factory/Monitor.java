package se1.hu3.factory;

public abstract class Monitor {
    int refreshRate;
    double size;
    Resolution resolution;
    public Monitor(int refreshRate, double size, Resolution resolution){
        this.refreshRate = refreshRate;
        this.size = size;
        this.resolution = resolution;
    }

    public abstract String getMonitorType();
}
