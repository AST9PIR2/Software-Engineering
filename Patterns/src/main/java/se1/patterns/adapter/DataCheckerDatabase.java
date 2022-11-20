package se1.patterns.adapter;

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
