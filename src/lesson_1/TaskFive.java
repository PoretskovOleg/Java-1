package lesson_1;

public class TaskFive {

    public static void main(String[] args) {
        int a = -10;

        System.out.println(checkNumber(a));
    }

    public static String checkNumber(int val) {
        String response = "Число отрицательноe";

        if (val >= 0) {
            response = "Число положительное";
        }

        return  response;
    }
}
