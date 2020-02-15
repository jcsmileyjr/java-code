package chp9;

public class BirthdayCake extends Cake {

    public int candles;

    public BirthdayCake(String flavor){
        setFlavor(flavor);
    }

    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }

}
