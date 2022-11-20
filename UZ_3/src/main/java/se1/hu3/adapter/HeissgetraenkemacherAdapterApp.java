package se1.hu3.adapter;

public class HeissgetraenkemacherAdapterApp {

    public static void main(String[] args) {
        Heissgetraenkemacher Kaffeemaschine = new Heissgetraenkemacher(new KaffeezubereitungClass());
        Heissgetraenkemacher KakaoMaschine = new Heissgetraenkemacher(new KakaoAdapter(new KakaozubereitungClass()));

        System.out.println("Neu im Sortiment!!! Wir erzeugen einen Kakao über den Adapter:");
        KakaoMaschine.macheGetraenk();
        System.out.println("\nWir erzeugen einen Kaffe über die alte Klasse Heissgetränkemacher:");
        Kaffeemaschine.macheGetraenk();
    }
}

