package se1.hu3.composite;

public class Gondelbahn extends Node{

    private double fahrgeschwindigkeit = 0;

    public Gondelbahn(String name) {
        super(name);
    }

    public void setFahrgeschwindigkeit(double fahrgeschwindigkeit){
        this.fahrgeschwindigkeit = fahrgeschwindigkeit;
        System.out.println("Fahrgeschwindigkeit von " + this.getName() + " wurde auf " + fahrgeschwindigkeit + " gesetzt!");
    }
    public void startup(){
        if(this.fahrgeschwindigkeit == 0){
            this.setFahrgeschwindigkeit(6);
        }
        System.out.println("Gondelbahn " + this.getName() + " wacht auf und fährt mit " + fahrgeschwindigkeit);
    }

    public void shutdown(){
        System.out.println("Der Fahrbetrieb für Gondelbahn " + this.getName() + " wurde eingestellt!");
    }

    @Override
    public String toString() {
        return "Gondelbahn " + this.getName() + " hat eine Geschwindigkeit von " + fahrgeschwindigkeit;
    }
}
