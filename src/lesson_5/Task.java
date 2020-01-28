package lesson_5;

public class Task {

    private static final int MAX_AGE = 40;

    public static void main(String[] args) {

        Person[] persons = new Person[5];

        persons[0] = new Person(
                "Иванов Иван Петрович",
                "Главный инженер",
                "ivanov@ivan.com",
                "+7 999 999 999",
                55,
                70000
        );

        persons[1] = new Person(
                "Соколов Игнат Иванович",
                "Мастер",
                "ivanov@ivan.com",
                "+7 888 888 888",
                50,
                60000
        );

        persons[2] = new Person(
                "Игнатов Сергей Александрович",
                "Инженер",
                "ivanov@ivan.com",
                "+7 777 777 777",
                45,
                50000
        );

        persons[3] = new Person(
                "Петров Алексей Алексеевич",
                "Младший инженер",
                "ivanov@ivan.com",
                "+7 666 666 666",
                40,
                40000
        );

        persons[4] = new Person(
                "Сидоров Максим Сергеевич",
                "Помощник инженера",
                "ivanov@ivan.com",
                "+7 555 555 555",
                35,
                30000
        );

        for (Person person : persons) {
            if (person.getAge() > MAX_AGE) {
                person.printInfo();
            }
        }
    }
}
