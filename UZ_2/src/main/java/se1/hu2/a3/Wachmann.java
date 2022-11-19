package se1.hu2.a3;

public class Wachmann extends Bewacher{

    public Wachmann(Observer beobachter) {
        initBewacher(beobachter);
    }

    public void AngriffMelden(){
        System.out.println("Halt, Bleib stehn!!! Pass auf oder ich erschieß dich!");
    }

    //Test github code

}
