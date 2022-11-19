package se1.hu2.a2;

public class Rechteck implements Figur{
    float laenge;
    float breite;

    public Rechteck(float laenge, float breite){
        this.laenge = laenge;
        this.breite = breite;
    }

    public float FlaecheBerechnen() {
        return laenge * breite;
    }

    public void skalieren(float factor){
        this.laenge = this.laenge * factor;
        this.breite = this.breite * factor;
    }

    public String toString(){
        return "Rechteck hat Seitenlängen " + laenge + " und " + breite + " und eine Fläche von " + FlaecheBerechnen();
    }
}
