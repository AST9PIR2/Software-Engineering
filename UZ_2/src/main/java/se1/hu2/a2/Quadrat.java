package se1.hu2.a2;

public class Quadrat extends Rechteck{
    public Quadrat(float Seitelaenge){
        super(Seitelaenge, Seitelaenge);
    }

    public String toString(){
        return "Quadrat hat Seitenlänge " + laenge + " und eine Fläche von " + FlaecheBerechnen();
    }
}
