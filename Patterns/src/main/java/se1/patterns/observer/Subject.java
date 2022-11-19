package se1.patterns.observer;

public interface Subject extends Observer {
    public void attach(Observer o);
    public void detach(Observer o);
    public void notifyObservers();


}
