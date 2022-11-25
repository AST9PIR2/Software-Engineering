package se1.se_patterns.patterns.adapter_DataChecker;

import java.util.ArrayList;

public class DataCheckerDatabase {

    public static final ArrayList<Integer> list= new ArrayList<>();

    public void add(int data){
        list.add(data);
    }

    public String toString(){
        return list.toString();
    }
}
