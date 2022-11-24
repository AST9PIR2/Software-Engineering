package se1.hu3.factory;

public class Resolution {

    int length;
    int height;
    public Resolution(int length, int height) {
        if (length > 0 && height > 0) {
            this.length = length;
            this.height = height;
        } else {
            this.length = 0;
            this.height = 0;
            System.out.println("not a viable resolution");
        }
    }
}
