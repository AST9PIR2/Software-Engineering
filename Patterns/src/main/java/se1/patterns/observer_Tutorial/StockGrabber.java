package se1.patterns.observer_Tutorial;

import java.util.ArrayList;

public class StockGrabber implements Subject{

    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    public StockGrabber() {

        observers = new ArrayList<Observer>();

    }
    @Override
    public void register(Observer newObserver) {

        observers.add(newObserver);

    }

    @Override
    public void unregister(Observer deleteObserver) {

        int observerIndex = observers.indexOf(deleteObserver);

        System.out.println("Observer " + (observerIndex+1) + " deleted");

        observers.remove(observerIndex);

    }

    @Override
    public void notifyObservers() {


        for(Observer observer : observers){
            observer.update(ibmPrice, aaplPrice, googPrice);
        }

    }

    public void setIbmPrice(double newIbmPrice){

        this.ibmPrice = newIbmPrice;
        notifyObservers();

    }

    public void setAaplPrice(double newAaplPrice){

        this.aaplPrice = newAaplPrice;
        notifyObservers();

    }

    public void setGoogPrice(double newGoogPrice){

        this.googPrice = newGoogPrice;
        notifyObservers();

    }
}
