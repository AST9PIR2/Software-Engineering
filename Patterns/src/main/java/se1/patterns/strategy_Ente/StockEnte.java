package se1.patterns.strategy_Ente;

public class StockEnte extends Ente {

    public StockEnte() {
        super(new FliegtMitFluegeln(), new Quaken());
    }

    @Override
    public void anzeigen() {
        System.out.println("Ich bin eine Stockente!");
    }

}

