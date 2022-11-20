package se1.patterns.observer_Tutorial;

public interface Subject {

    public void register(Observer o);
    public void unregister(Observer o);
    public void notifyObservers();
}
