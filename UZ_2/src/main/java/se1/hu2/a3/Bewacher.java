package se1.hu2.a3;

public abstract class Bewacher {

    Observer mybeobachter;

    //damit man weiß wenn Zombies angreifen
    public abstract void AngriffMelden();

    //Konstruktor
    public void initBewacher(Observer beobachter){
        mybeobachter = beobachter;
        beobachter.addBewacher(this);
    }

    public void deleteBewacher(Observer beobachter){
        beobachter.deleteBewacher(this);
    }

}
