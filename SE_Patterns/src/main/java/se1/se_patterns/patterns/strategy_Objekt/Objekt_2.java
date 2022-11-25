package se1.se_patterns.patterns.strategy_Objekt;

public class Objekt_2 implements SelectStrategy {
    public void select(String pattern) {
        System.out.println("Objekt_2: "  + pattern + " Ich mach das ein wenig anders!");
    }
}
