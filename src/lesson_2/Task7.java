package lesson_2;

import java.util.Arrays;

public class Task7 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(arr));

        // Получаем новый массив не изменяя старого
        int[] newArray = changeArr(arr, 5);
        System.out.println(Arrays.toString(newArray));

        // Изменяем входной массив
        changeArray(arr, -15);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Вариант 1
     * @param arItems - одномерный массив
     * @param step - шаг смещения элементов
     */
    public static void changeArray(int[] arItems, int step) {

        // Если шаг больше длины масива
        step %= arItems.length;

        if (step < 0) {
            step += arItems.length;
        }

        // Производим сдвиг по одному элементу step раз
        while (step > 0) {
            int element = arItems[arItems.length - 1];

            for (int i = arItems.length - 1; i > 0; i--) {
                arItems[i] = arItems[i - 1];
            }
            arItems[0] = element;
            step--;
        }
    }

    /**
     * Вариант 2
     * @param arItems - одномерный массив
     * @param step - шаг смещения элементов
     * @return - массив со смещенными элементами
     */
    public static int[] changeArr(int[] arItems, int step) {

        int[] newArr = new int[arItems.length];

        // Граничный элемент массива, начиная с которого двигаем элементы
        int pipe;

        if(step < 0) {
            step = step % arItems.length * (-1);
            pipe = arItems.length - step;
        } else {
            pipe = step % arItems.length;
        }

        // Заполняем новый массив соответсвующимим элементами входного массива
        for (int i = 0; i < arItems.length; i++) {
            if (i < pipe) {
                newArr[i] = arItems[i + arItems.length - pipe];
            } else {
                newArr[i] = arItems[i - pipe];
            }

        }
        return newArr;
    }
}
