package se1.hu2.a3;

public class Wachhund extends Bewacher{

    public Wachhund(Observer beobachter) {
        initBewacher(beobachter);
    }
    public void AngriffMelden(){
        System.out.println("GRRR, BRRRR ---- BEISS!");
    }

}
