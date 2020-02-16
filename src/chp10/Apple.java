package chp10;

public class Apple extends Fruit{

    public Apple(){
        setCalories(100);
    }

    public void removeSeeds(){
        System.out.println("Remove the seeds");
    }

    @Override
    public void makeJuice() {
        System.out.println("Make Apple Juice");
    }
}
