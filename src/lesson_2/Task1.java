package lesson_2;

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {

        int[] arr = {1, 0, 0, 0, 1, 1, 1, 0};
        System.out.println(Arrays.toString(arr));

        int[] newArr = changeArray(arr);
        System.out.println(Arrays.toString(newArr));
    }

    public static int[] changeArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] == 0 ? 1 : 0;
        }
        return arr;
    }
}
