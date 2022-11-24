package se1.patterns.strategy_Ente;

public class GummiEnte extends Ente {

    public GummiEnte() {
        super(new FliegtGarNicht(), new Quietschen());
    }

    @Override
    public void anzeigen() {
        System.out.println("Ich bin eine GummiEnte!");
    }

}

