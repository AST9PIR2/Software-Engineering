package se1.patterns.adapter;

public class Client {
    public static void main(String[] args) {

        DataChecker datachecker = new DataCheckerAdapter();
        System.out.println(datachecker.check(60));
        System.out.println(datachecker.check(10));
        System.out.println(datachecker.check(20));
        System.out.println(datachecker.check(30));
        System.out.println(DataCheckerDatabase.list);
    }
}
