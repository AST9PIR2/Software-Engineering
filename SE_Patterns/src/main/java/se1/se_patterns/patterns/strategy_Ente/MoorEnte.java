package se1.se_patterns.patterns.strategy_Ente;

public class MoorEnte extends Ente {

    public MoorEnte() {
        super(new FliegtMitFluegeln(), new Quaken());
    }

    @Override
    public void anzeigen() {
        System.out.println("Ich bin eine MoorEnte.");
    }

}

