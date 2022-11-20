package se1.hu3.composite;

public class Fahrbetriebsmittel extends Node{

    public Fahrbetriebsmittel(String name) {
        super(name);
    }

    public void startup(){
        System.out.println("Fahrmittel " + this.getName() + " " + this.getId() + " wurde an Gondelbahn angehängt!");
    }

    public void shutdown(){
        System.out.println("Fahrmittel " + this.getName() + " " + this.getId() + " wurde von Gondelbahn ausgehängt!");
    }
}
