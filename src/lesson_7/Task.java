package lesson_7;

import java.util.Random;

public class Task {

    public static final int COUNT_CATS = 10;
    public static final int COUNT_FOOD = 100;

    public static void main(String[] args) {

        Plate plate = new Plate(COUNT_FOOD);

        Cat[] cats = createCats();

        eatCats(plate, cats);

        plate.getInfo();
    }

    /**
     * Создадим котов
     * @return
     */
    private static Cat[] createCats() {

        Random random = new Random();
        Cat[] cats = new Cat[COUNT_CATS];

        for (int i = 0; i < COUNT_CATS; i++) {
            cats[i] = new Cat("Cat_" + (i + 1), random.nextInt(30) + 1);
            cats[i].getInfo();
        }

        System.out.println("============================");
        return cats;
    }

    /**
     * Накормим всех котов
     * @param plate
     * @param cats
     */
    private static void eatCats(Plate plate, Cat[] cats) {

        while (true) {
            int countEatenCats = 0;
            for (Cat cat : cats) {
                if (cat.isHungry()) {
                    cat.eat(plate);
                    cat.getInfoHungry();
                }

                if (!cat.isHungry()) countEatenCats++;
            }
            if (countEatenCats == COUNT_CATS) break;

            System.out.println("=========================");

            addFood(plate);
        }
    }

    /**
     * Добавим еду в тарелку
     * @param plate
     */
    private static void addFood(Plate plate) {

        if (plate.getFood() < COUNT_FOOD) {
            plate.addFood(COUNT_FOOD - plate.getFood());
        }
    }
}
