package se1.hu3.adapter;

public class KakaoAdapter implements Kaffeezubereitung{

    KakaozubereitungClass kzb;

    public KakaoAdapter(KakaozubereitungClass kzb){
        this.kzb = kzb;
    }
    @Override
    public void kaffeebohnenRoesten() {
        kzb.pulvermengeBestimmen();
    }

    @Override
    public void bohnenMahlen() {
        // tu nix
    }

    @Override
    public void wasserAufgiessen() {
        kzb.mitWasserVermischen();

    }

    @Override
    public void kaffeeAusgeben() {
        kzb.kakaoAusgeben();
    }

}
