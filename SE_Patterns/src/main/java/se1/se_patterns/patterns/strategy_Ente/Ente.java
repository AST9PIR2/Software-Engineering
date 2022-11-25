package se1.se_patterns.patterns.strategy_Ente;

public class Ente {

    private FlugVerhalten flugVerhalten;
    private QuakVerhalten quakVerhalten;

    public Ente(FlugVerhalten fv, QuakVerhalten qv) {
        flugVerhalten = fv;
        quakVerhalten = qv;
    }

    public void fliegen() {
        flugVerhalten.fliegen();
    }

    public void quaken() {
        quakVerhalten.quaken();
    }

    public void setFlugVerhalten(FlugVerhalten flugVerhalten) {
        this.flugVerhalten = flugVerhalten;
    }

    public void setQuakVerhalten(QuakVerhalten quakVerhalten) {
        this.quakVerhalten = quakVerhalten;
    }

    public void anzeigen() {
        System.out.println("Ich bin eine Ente!");
    }

}
