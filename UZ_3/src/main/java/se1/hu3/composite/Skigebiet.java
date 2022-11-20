package se1.hu3.composite;

public class Skigebiet extends Node{
    public Skigebiet(String name){
        super(name);
    }

    public void startup(){
        System.out.println("Skigebiet " + this.getName() + " wacht auf...");
    }

    public void shutdown(){
        System.out.println("Skigebiet " + this.getName() + " schläft ein... Skibetrieb wird eingestellt...");
    }

}

