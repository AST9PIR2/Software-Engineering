package se1.patterns.observer;

public class ConcreteObserver implements Observer {

    private String observerState(){
        return "Observer State";
    }

    public void update(){
        System.out.println("ConcreteObserver.update() called");
    }
}
