package lesson_7;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public boolean decreaseFood(int food) {

        if (food <= this.food) {
            this.food -= food;
            return true;
        }

        return false;
    }

    public void addFood(int food) {
        this.food += food;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                '}';
    }

    public void getInfo() {
        System.out.println(this);
    }
}
