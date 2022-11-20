package se1.patterns.factory_Tutorial;

public class EnemyShipFactory {

    public EnemyShip makeEnemyShip(String newShipType) {

        return switch (newShipType) {
            case "U" -> new UFOEnemyShip();
            case "R" -> new RocketEnemyShip();
            case "B" -> new BigUFOEnemyShip();
            default -> null;
        };
    }
}
