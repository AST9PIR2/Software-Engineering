package se1.patterns.singleton;

public class main {

        public static void main(String[] args) {
            Singleton.getInstance();


            System.out.println(Singleton.getId());
            System.out.println(Singleton.getId());
            System.out.println(Singleton.getId());
            System.out.println(Singleton.getId());

            Singleton.getInstance();

            System.out.println(Singleton.getId());
            System.out.println(Singleton.getId());
            System.out.println(Singleton.getId());
            System.out.println(Singleton.getId());
        }
}
