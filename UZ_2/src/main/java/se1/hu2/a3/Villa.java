package se1.hu2.a3;


import java.util.ArrayList;

public class Villa implements Observer{

    static ArrayList<Bewacher> Bewacherlist = new ArrayList<>();

    @Override
    public void addBewacher(Bewacher Aufpasser) {
        Bewacherlist.add(Aufpasser);
    }

    @Override
    public void deleteBewacher(Bewacher Aufpasser){
        Bewacherlist.remove(Aufpasser);
    }

    public void zombieGreiftAn(){
        System.out.println("\nAhhhh!!! Zombies!");

        if(Bewacherlist.size() == 0){
            System.out.println("Zombies fressen alle auf!1!!1!!1!");
        } else {
            for (Bewacher xy: Bewacherlist) {
                xy.AngriffMelden();
            }
            System.out.println("Einbrecher erfolgreich abgewehrt!");
        }
    }




}
