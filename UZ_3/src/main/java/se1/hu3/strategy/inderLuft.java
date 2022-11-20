package se1.hu3.strategy;

public class inderLuft implements Fluglenkstrategien{
    @Override
    public void steuern(double winkel) {
        System.out.println("Kursänderung im Flug um " + winkel + " Grad.");

    }

}
