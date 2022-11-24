package se1.patterns.strategy_Ente;

public class FliegtGarNicht implements FlugVerhalten {

    @Override
    public void fliegen() {
        System.out.println("Ich kann nicht fliegen!");
    }

}

