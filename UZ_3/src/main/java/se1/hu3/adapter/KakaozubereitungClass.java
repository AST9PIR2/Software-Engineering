package se1.hu3.adapter;

public class KakaozubereitungClass implements Kakozubereitung{
    @Override
    public void pulvermengeBestimmen() {
        System.out.println("Pulvermenge wird bestimmt!");
    }

    @Override
    public void mitWasserVermischen() {
        System.out.println("Pulver wird mit Wasser vermischt!");
    }

    @Override
    public void kakaoAusgeben() {
        System.out.println("Kakao wird ausgegeben!");
    }
}
