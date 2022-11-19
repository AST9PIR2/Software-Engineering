package se1.patterns.adapter;

public class DataCheckerAdapter implements DataChecker {

    public String check(int data) {
        if (data > 50) {
            return "Data is too big";
        } else {
            DataCheckerDatabase.add(data);
            return "Data is ok";
        }
    }
}

