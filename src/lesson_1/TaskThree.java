package lesson_1;

public class TaskThree {

    public static void main(String[] args) {
        float a = 25.325f;
        float b = 354.21f;
        float c = 12f;
        float d = -12354.1245f;

        System.out.println(calc(a, b, c, d));
    }

    public static float calc(float a, float b, float c, float d) {
        return (a * (b + (c / d)));
    }
}
