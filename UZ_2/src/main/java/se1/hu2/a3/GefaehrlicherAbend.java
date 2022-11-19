package se1.hu2.a3;

public class GefaehrlicherAbend{

    public static void main(String[] args){

    Villa riesenVilla = new Villa();
        System.out.println("Villa unbewacht");
        riesenVilla.zombieGreiftAn();

        new Wachhund(riesenVilla);
        riesenVilla.zombieGreiftAn();

        new Alarmanlage(riesenVilla);
        new Wachmann(riesenVilla);

        riesenVilla.zombieGreiftAn();
    }
}
