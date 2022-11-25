package se1.se_patterns.patterns.strategy_Ente;

public class FliegtMitFluegeln implements FlugVerhalten {

    @Override
    public void fliegen() {
        System.out.println("Ich fliege mit meinen Flügeln!");
    }

}

