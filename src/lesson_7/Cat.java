package lesson_7;

public class Cat {

    private String name;
    private int appetite;
    private boolean isHungry;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isHungry = true;
    }

    public String getName() {
        return this.name;
    }

    public int getAppetite() {
        return this.appetite;
    }

    public boolean isHungry() { return this.isHungry; }

    public void getInfoHungry() {
        System.out.printf(
        "Кот %s (аппетит - %d) - %s %n",
            this.name,
            this.appetite,
            this.isHungry ? "голодный" : "сытый"
        );
    }

    public void eat(Plate plate) {
        if (plate.decreaseFood(this.appetite)) {
            this.isHungry = false;
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", isHungry=" + isHungry +
                '}';
    }

    public void getInfo() {
        System.out.println(this);
    }
}
