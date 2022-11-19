package se1.hu2.a2;

public class Kreis implements Figur {
    float radius;
    float pi = (float) 3.1415;

    public Kreis(float radius){
        this.radius = radius;
    }

    public float FlaecheBerechnen() {
        return radius * radius * pi;
    }

    public void skalieren(float factor){
        this.radius = this.radius * factor;
    }

    public String toString(){
        return "Kreis hat Radius von " + radius + " und eine Fläche von " + FlaecheBerechnen();
    }

}
