package se1.patterns.strategy_Objekt;

public class Objekt_3 implements SelectStrategy {
    public void select(String pattern) {
        System.out.println("Objekt_3: " + pattern + " Ich mach das komplett anders anders!");
    }
}
