package se1.hu3.adapter;

public class KaffeezubereitungClass implements Kaffeezubereitung{
    @Override
    public void kaffeebohnenRoesten() {
        System.out.println("Kaffeebohnen werden geröstet!");
    }

    @Override
    public void bohnenMahlen() {
        System.out.println("Kaffeebohnen werden gemahlen!");
    }

    @Override
    public void wasserAufgiessen() {
        System.out.println("Kaffeebohnen werden aufgegossen!");

    }

    @Override
    public void kaffeeAusgeben() {
        System.out.println("Kaffee wird serviert!");
    }
}
