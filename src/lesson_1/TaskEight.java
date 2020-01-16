package lesson_1;

public class TaskEight {

    public static void main(String[] args) {

        int year = 2044;

        System.out.println(checkYear(year));

    }

    public static String checkYear(int year) {

        String response = "Год не високосный";

        if (
            year % 4 == 0 &&
            (
                !(year % 100 == 0) ||
                year % 400 == 0
            )
        ) {
            response = "Год високосный";
        }

        return response;
    }
}
