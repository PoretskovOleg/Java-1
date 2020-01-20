package lesson_2;

import java.util.Arrays;

public class Task3 {

    public static void main(String[] args) {

        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println(Arrays.toString(arr));

        int[] newArr = changeArray(arr);
        System.out.println(Arrays.toString(newArr));
    }

    public static int[] changeArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] < 6) ? (array[i] * 2) : array[i];
        }

        return  array;
    }
}
