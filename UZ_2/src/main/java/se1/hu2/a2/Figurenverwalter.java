package se1.hu2.a2;
import java.util.ArrayList;

public class Figurenverwalter {
    static ArrayList<Figur> Figuren = new ArrayList<>();

    public static void main(String[] args){
        //Instanz einfügen erübrigt sich, weil wir ein static array haben
        //
        //Formen einfügen
        Figuren.add(new Kreis(3)); //index 0
        Figuren.add(new Quadrat(4)); //index 1
        Figuren.add(new Rechteck(2,5)); //index 2
        Figuren.add(new Rechteck(2,5)); //index 3
        //eine Skalieren
        Figuren.get(3).skalieren(2);
        //Figuren ausgeben
        //printFiguren();
        GesamtflaecheBerechnen();
    }

    public static void printFiguren(){
        for (Figur x:Figuren) {
            System.out.println(x);
        }
    }

    public static void GesamtflaecheBerechnen(){
        float Gesamt = (float) 0.0;

        for (Figur x : Figuren) {
            Gesamt += x.FlaecheBerechnen();
        }
        System.out.println("Die Gesamtfläche aller Figuren beträgt: " + Gesamt);
    }

}
