package lesson_6;

public class Task {

    public static void main(String[] args) {

        Cat cat1 = new Cat(100, 2, 3);
        Cat cat2 = new Cat(10, 0, 0);
        Dog dog1 = new Dog(300, 50, 1.5f);
        Dog dog2 = new Dog(100, 20, 0.5f);

        System.out.println("==== CAT_1 INFO ====");
        cat1.run(90);
        cat1.swim(1);
        cat1.jump(2);

        System.out.println("==== CAT_2 INFO ====");
        cat2.run(80);
        cat2.swim(1);
        cat2.jump(1);

        System.out.println("==== DOG_1 INFO ====");
        dog1.run(200);
        dog1.swim(40);
        dog1.jump(1f);

        System.out.println("==== DOG_2 INFO ====");
        dog2.run(150);
        dog2.swim(30);
        dog2.jump(1.5f);
    }
}
