package se1.se_patterns.patterns.strategy_Ente;

public class FliegtGarNicht implements FlugVerhalten {

    @Override
    public void fliegen() {
        System.out.println("Ich kann nicht fliegen!");
    }

}

