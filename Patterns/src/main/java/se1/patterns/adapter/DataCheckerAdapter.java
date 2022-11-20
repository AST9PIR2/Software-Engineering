package se1.patterns.adapter;

public class DataCheckerAdapter implements DataChecker {

    DataCheckerDatabase dataCheckerDatabase = new DataCheckerDatabase();

    public String check(int data) {
        if (data > 50) {
            return "Data is too big";
        } else {
            dataCheckerDatabase.add(data);
            return "Data is ok";
        }
    }
}

