package lesson_2;

public class Task4 {

    public static void main(String[] args) {

        int[][] newArray = createArray(7);
        printArr(newArray);
    }

    public static int[][] createArray(int size) {
        int[][] arr = new int[size][size];

        for (int i = 0; i < size; i++) {
            arr[i][i] = 1;
        }

        return arr;
    }

    public static void printArr(int[][] arr) {

        for (int[] items : arr) {
            for (int item : items) {
                System.out.print(item + "  ");
            }
            System.out.println();
        }
    }
}
