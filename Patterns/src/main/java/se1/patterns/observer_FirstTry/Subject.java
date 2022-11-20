package se1.patterns.observer_FirstTry;

public interface Subject extends Observer {
    public void attach(Observer o);
    public void detach(Observer o);
    public void notifyObservers();


}
