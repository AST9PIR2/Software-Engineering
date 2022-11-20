package se1.patterns.adapter_Tutorial;

public class Client {


        //https://www.newthinktank.com/2012/09/adapter-design-pattern-tutorial/
        //Trying to learn this pattern. Thanks to the author Derek Banas

        public static void main(String[] args) {
                EnemyAttacker rx7Tank = new EnemyTank();

                EnemyAttacker robotAdapter = new EnemyRobotAdapter(new EnemyRobot());

                System.out.println("The Enemy Tank");

                rx7Tank.assignDriver("Frank");
                rx7Tank.driveForward();
                rx7Tank.fireWeapon();
                System.out.println();

                System.out.println("The Robot with Adapter");

                robotAdapter.assignDriver("Mark");
                robotAdapter.driveForward();
                robotAdapter.fireWeapon();
        }
}
