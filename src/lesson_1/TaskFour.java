package lesson_1;

public class TaskFour {

    public static void main(String[] args) {

        float a = 10f;
        float b = 15f;

        System.out.println(checkSum(a, b));
    }

    public static boolean checkSum(float a, float b) {
        float sum = a + b;

        return sum >= 10 && sum <= 20;
    }
}
