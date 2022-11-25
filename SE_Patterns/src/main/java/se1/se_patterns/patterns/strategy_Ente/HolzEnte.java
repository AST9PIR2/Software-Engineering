package se1.se_patterns.patterns.strategy_Ente;

public class HolzEnte extends Ente {

    public HolzEnte() {
        super(new FliegtGarNicht(), new Stumm());
    }

    @Override
    public void anzeigen() {
        System.out.println("Ich bin eine Holzente!");
    }

}

