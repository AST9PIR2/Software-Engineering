package se1.patterns.observer_Tutorial;

public interface Subject {

    void register(Observer o);
    void unregister(Observer o);
    void notifyObservers();
}
