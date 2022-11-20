package se1.hu3.adapter;

public class Heissgetraenkemacher {
    Kaffeezubereitung getraenk;

    public Heissgetraenkemacher(Kaffeezubereitung getraenk){
        this.getraenk = getraenk;
    }

    public void macheGetraenk() {

        getraenk.kaffeebohnenRoesten();
        getraenk.bohnenMahlen();
        getraenk.wasserAufgiessen();
        getraenk.kaffeeAusgeben();
    }
}
