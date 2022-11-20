package se1.hu3.composite;

public class LiftCompositeApp {

    public static void main(String[] args) {


        Skigebiet skigebiet = new Skigebiet("stubaierGletscher");

        Gondelbahn eisgratbahn = new Gondelbahn("eisgratbahn");

        skigebiet.addNode(eisgratbahn);

        for(int i = 0; i < 4; i++){
            Fahrbetriebsmittel fbm = new Fahrbetriebsmittel( "eisgb_fbm");
            eisgratbahn.addNode(fbm);
        }


        Gondelbahn schaufeljochbahn = new Gondelbahn("schaufeljochbahn");

        skigebiet.addNode(schaufeljochbahn);

        for(int i = 0; i < 4; i++){
            Fahrbetriebsmittel fbm = new Fahrbetriebsmittel( "sjb_fbm");
            schaufeljochbahn.addNode(fbm);
        }

        System.out.println("\nDate: 25:12:2022");

        schaufeljochbahn.setFahrgeschwindigkeit(7);

        skigebiet.startupAll();


        schaufeljochbahn.setFahrgeschwindigkeit(12);

        schaufeljochbahn.removeNodes(schaufeljochbahn.getSubNode(1011));

        System.out.println("\nDer Tag neigt sich dem Ende zu!");

        skigebiet.shutdownAll();

        //Nächster Tag

        System.out.println("\nDate: 26:12:2022");

        skigebiet.startupAll();

        schaufeljochbahn.setFahrgeschwindigkeit(9);

        System.out.println("\nDer Tag neigt sich dem Ende zu!");
        skigebiet.shutdownAll();
        
    }
}

