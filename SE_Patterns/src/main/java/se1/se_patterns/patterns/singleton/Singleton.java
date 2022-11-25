package se1.se_patterns.patterns.singleton;

public class Singleton {

    private static Singleton firstInstance = null;

    private static Integer id = 0;

    private Singleton(){}

    public static Singleton getInstance(){

        if(firstInstance == null){
            firstInstance = new Singleton();
        }

        return firstInstance;
    }

    public Integer getId() {
        id += 1;
        return id;
    }

}
