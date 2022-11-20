package se1.patterns.adapter_Tutorial;

import java.util.Random;

public class EnemyTank implements EnemyAttacker {

    Random generator = new Random();
    @Override
    public void fireWeapon() {

        int attackDamage = generator.nextInt(10) + 1;

        System.out.println("Enemy Tank Causes " + attackDamage + " Damage With Its Claw");
    }
    @Override
    public void driveForward() {

        int movement = generator.nextInt(5) + 1;

        System.out.println("Enemy Tank Moves " + movement + " Spaces");
    }
    @Override
    public void assignDriver(String driverName) {

        System.out.println(driverName + " is Driving the Tank");
    }
}
