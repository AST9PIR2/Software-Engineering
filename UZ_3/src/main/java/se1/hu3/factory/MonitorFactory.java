package se1.hu3.factory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MonitorFactory {


    public MonitorFactory(){

    }

    //Office Monitor = a
    //Gaming Monitor = b
    //Design Monitor = c
    ArrayList<String> monitor_types = new ArrayList<>(Arrays.asList("a", "b", "c"));

    public Monitor createMonitor(int refreshRate, double size, Resolution resolution){
        ArrayList<String> typefinder = new ArrayList<>();

        //refresh rate evaluation
        if(refreshRate >= 30 && refreshRate <= 50) {
            typefinder.add("a");
        }
        if(refreshRate >= 75 && refreshRate <= 240){
            typefinder.add("b");
        }
        if(refreshRate >= 55 && refreshRate <= 90){
            typefinder.add("c");
        }

        //size evaluation
        if(size >= 23.8 && size <= 27) {
            typefinder.add("a");
        }
        if(size >= 23.8 && size <= 28){
            typefinder.add("b");
        }
        if(size >= 31.5) {
            typefinder.add("c");
        }

        //resolution evaluation
        if((resolution.length >= 1280 && resolution.length <= 1920) && (resolution.height >= 1024 && resolution.height <= 1200)) {
            typefinder.add("a");
        }
        if((resolution.length >= 1920 && resolution.length <= 2560) && (resolution.height >= 1024 && resolution.height <= 1440)) {
                typefinder.add("b");
        }
        if((resolution.length >= 1920 && resolution.length <= 3840) && (resolution.height >= 1200 && resolution.height <= 2160)) {
                typefinder.add("c");
        }

        String your_Monitor_type = "a";
        int max = 0;

        for (String type:this.monitor_types) {
            int freq = Collections.frequency(typefinder, type);
            //System.out.println(freq + type);
            if (freq > max){
                your_Monitor_type = type;
                max = freq;
            }
        }

        switch (your_Monitor_type){
            case "a":
                System.out.println("A Office Monitor is being built because of " + max + " matches!");
                return new OfficeMonitor(refreshRate, size, resolution);
            case  "b":
                System.out.println("A Gaming Monitor is being built because of " + max + " matches!");
                return new GamingMonitor(refreshRate, size, resolution);
            case "c":
                System.out.println("A Design Monitor is being built because of " + max + " matches!");
                return new DesignMonitor(refreshRate, size, resolution);
        }

        return  null;
    }
}
