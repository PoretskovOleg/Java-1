package lesson_2;

public class Task5 {

    public static void main(String[] args) {

        float[] arr = {-1, 0, 5, 2, 1, -5, 7, 10, 2, -3};

        float min = getMin(arr);
        System.out.println("Minimum - " + min);
        float max = getMax(arr);
        System.out.println("Maximum - " + max);
    }

    public static float getMax (float[] arr) {

        float max = arr[0];
        for (float item : arr) {
            max = (item > max) ? item : max;
            //max = Math.max(item, max);
        }
        return max;
    }

    public static float getMin(float[] arr) {

        float min = arr[0];
        for (float item : arr) {
            min = (item < min) ? item : min;
            //min = Math.min(item, min);
        }
        return min;
    }
}
