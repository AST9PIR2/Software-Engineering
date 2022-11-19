package se1.patterns.strategy;

public class Objekt_1 implements SelectStrategy {
    public void select(String pattern) {
        System.out.println("Objekt_1: " + pattern + " Ich mach das so!");
    }
}
