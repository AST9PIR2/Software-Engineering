package se1.hu3.strategy;

public class Flugzeug {

    static Fluglenkstrategien strategy;

    //Status sind wir in der Luft oder am Boden?
    static Boolean inAir;

//    Fluglenkstrategien strategy = new Fluglenkstrategien();

    public Flugzeug(){
        inAir = false;
    }

    public void steuern(double winkel){
        if(inAir){
            strategy = new inderLuft();
            strategy.steuern(winkel);
        } else {
            new amBoden();
            strategy = new amBoden();
            strategy.steuern(winkel);
        }
    }

    public void starten(String startFlughafen) {
        System.out.println("Abgehoben in " + startFlughafen);
        inAir = true;
    }

    public void landen(String zielFlugafen) {
        System.out.println("Gelandet in " + zielFlugafen);
        inAir = false;
    }

}
