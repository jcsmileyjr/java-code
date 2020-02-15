package chp9;

public class WeddingCake extends Cake {
    public int tiers;

    public WeddingCake(String flavor){
        setFlavor(flavor);
    }

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }
}
