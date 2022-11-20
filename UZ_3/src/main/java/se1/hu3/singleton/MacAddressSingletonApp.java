package se1.hu3.singleton;

public class MacAddressSingletonApp {

    public static void main(String[] args) {

        MacSingleton generator = MacSingleton.getInstance();

        System.out.println("your current mac address = " + generator.getMac_address() + " with Instance " + MacSingleton.getInstance());
        System.out.println("your current mac address = " + generator.getMac_address() + " with Instance " + MacSingleton.getInstance());
        System.out.println("your current mac address = " + generator.getMac_address() + " with Instance " + MacSingleton.getInstance());
        System.out.println("your current mac address = " + generator.getMac_address() + " with Instance " + MacSingleton.getInstance());
        System.out.println("your current mac address = " + generator.getMac_address() + " with Instance " + MacSingleton.getInstance());
        System.out.println("your current mac address = " + generator.getMac_address() + " with Instance " + MacSingleton.getInstance());
    }
}

