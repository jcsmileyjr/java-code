package chp10;

public class Banana extends Fruit {
    public Banana(){
        setCalories(150);
    }

    public void peel(){
        System.out.println("Peel the Banana");
    }

    @Override
    public void makeJuice() {
        System.out.println("Make a banana smoothie");
    }
}
