package se1.patterns.singleton;

public class Singleton {

    private static Singleton firstInstance = null;

    private static Integer id;

    private Singleton(){

        id = 0;
    }

    public static Singleton getInstance(){

        if(firstInstance == null){
            firstInstance = new Singleton();
        }
        return firstInstance;
    }


    public static Integer getId() {
        id += 1;
        return id;
    }

}
