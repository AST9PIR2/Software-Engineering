package se1.patterns.singleton;

public class UniqueId {

    public static void main(String[] args) {
        test();

        test();
    }

    private static void test() {
        var generator = Singleton.getInstance();

        System.out.println("ID: " + Singleton.getId() + " with Instance " + generator);
        System.out.println("ID: " + Singleton.getId() + " with Instance " + generator);
        System.out.println("ID: " + Singleton.getId() + " with Instance " + generator);
        System.out.println("ID: " + Singleton.getId() + " with Instance " + generator);
    }
}
