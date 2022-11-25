package se1.se_patterns.patterns.strategy_Ente;

public class EntenTeich {
    public static void main(String[] args) {
        Ente Enterich = new StockEnte();
        Enterich.anzeigen();
        Enterich.fliegen();
        Enterich.quaken();

        System.out.println("\n--------------------------------------------");

        Ente Ente = new HolzEnte();
        Ente.anzeigen();
        Ente.fliegen();
        Ente.quaken();

        System.out.println("\n--------------------------------------------");

        Ente Quitschi = new GummiEnte();
        Quitschi.anzeigen();
        Quitschi.fliegen();
        Quitschi.quaken();
    }
}
