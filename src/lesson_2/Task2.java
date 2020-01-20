package lesson_2;

import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {

        int[] newArr = createArray(8, 3);
        System.out.println(Arrays.toString(newArr));

        int[] newArr2 = createArray(5, 5);
        System.out.println(Arrays.toString(newArr2));
    }

    public static int[] createArray(int size, int step) {

        if (size < 0) {
            return null;
        }

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = i * step;
        }

        return arr;
    }
}
