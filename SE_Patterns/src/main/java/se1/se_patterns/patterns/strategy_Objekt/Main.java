package se1.se_patterns.patterns.strategy_Objekt;

public class Main {
    public static void main(String[] args) {

        SelectStrategy strategy1 = new Objekt_1();
        SelectStrategy strategy2 = new Objekt_2();
        SelectStrategy strategy3 = new Objekt_3();

        strategy1.select("Strategy 1");
        strategy2.select("Strategy 2");
        strategy3.select("Strategy 3");

    }
}
