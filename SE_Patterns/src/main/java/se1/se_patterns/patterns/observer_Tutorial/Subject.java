package se1.se_patterns.patterns.observer_Tutorial;

public interface Subject {

    void register(Observer o);
    void unregister(Observer o);
    void notifyObservers();
}
