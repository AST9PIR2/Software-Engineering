package se1.hu3.singleton;

public class MacSingleton {
    private static final MacSingleton instance = new MacSingleton();

    static private long mac_address = 11_12_13_14_15;
    private MacSingleton() {

    }

    public static MacSingleton getInstance(){
        return instance;
    }

    public long getMac_address(){
        mac_address += 1;
        return mac_address;
    }
}
