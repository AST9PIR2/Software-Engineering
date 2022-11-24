package se1.hu3.factory;

public class ScreenFactoryApp {

    public static void main(String[] args) {
        MonitorFactory factory  = new MonitorFactory();

        Monitor m1 = factory.createMonitor(80, 32.0, new Resolution(1920, 1200));
        Monitor m2 = factory.createMonitor(40, 26.5, new Resolution(1280, 1024));
        Monitor m3 = factory.createMonitor(240, 28.0, new Resolution(2560, 1440));
        Monitor m4 = factory.createMonitor(55, 28.0, new Resolution(2560, 1440));
        Monitor m5 = factory.createMonitor(50, 30.5, new Resolution(4000, 2500));

        System.out.println("List of monitors:");
        System.out.println("Monitor Message: " + m1.getMonitorType() + " | Type: " + m1.getClass().getName());
        System.out.println("Monitor Message: " + m2.getMonitorType() + " | Type:: " + m2.getClass().getName());
        System.out.println("Monitor Message: " + m3.getMonitorType() + " | Type:: " + m3.getClass().getName());
        System.out.println("Monitor Message: " + m4.getMonitorType() + " | Type:: " + m4.getClass().getName());
        System.out.println("Monitor Message: " + m5.getMonitorType() + " | Type:: " + m5.getClass().getName());

    }
}
