package se1.hu3.strategy;

public class PlaneStrategyApp {

    public static void main(String[] args) {
        Flugzeug our_plane = new Flugzeug();
        our_plane.steuern(25.5);
        our_plane.starten("Innsbruck");
        our_plane.steuern(16.6);
        our_plane.steuern(10.2);
        our_plane.landen("Wien");
        our_plane.steuern(32.6);
    }
}

