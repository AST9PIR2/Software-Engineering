package se1.se_patterns.patterns.singleton;

public class UniqueId {

    public static void main(String[] args) {
        test();

        test();
    }

    private static void test() {
        Singleton generator = Singleton.getInstance();

        System.out.println("ID: " + generator.getId() + " with Instance " + generator);
        System.out.println("ID: " + generator.getId() + " with Instance " + generator);
        System.out.println("ID: " + generator.getId() + " with Instance " + generator);
        System.out.println("ID: " + generator.getId() + " with Instance " + generator);
    }
}
