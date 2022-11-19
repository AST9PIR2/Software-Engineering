package se1.hu2.a3;

public class Alarmanlage extends Bewacher{
    public Alarmanlage(Observer beobachter) {
        initBewacher(beobachter);
    }
    public void AngriffMelden(){
        System.out.println("BIEEEEP, BIEEEP, BIEEEP! Alarm gemeldet!");
    }
}
