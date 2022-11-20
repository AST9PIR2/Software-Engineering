package se1.patterns.observer_FirstTry;

public class ConcreteObserver implements Observer {

    private String observerState(){
        return "Observer State";
    }

    public void update(){
        System.out.println("ConcreteObserver.update() called");
    }
}
