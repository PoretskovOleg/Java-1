package lesson_2;

public class Task6 {

    public static void main(String[] args) {

        System.out.println(checkBalance(new int[]{2, 2, 2, 1, 2, 2, 10, 1}));
        System.out.println(checkBalance(new int[]{1, 1, 1, 2, 1}));
        System.out.println(checkBalance(new int[]{1, 2, 5, 4, 8, 1, 3, 2}));
    }

    public static boolean checkBalance(int[] arr) {

        boolean isEqual = false;

        for (int i = 0; i < arr.length-1; i++) {

            int sumLeft = getSumChunkArray(arr, 0, i);
            int sumRight = getSumChunkArray(arr, i+1, arr.length - 1);

            if (sumLeft == sumRight) {
                isEqual = true;
                break;
            }
        }

        return isEqual;
    }

    public static int getSumChunkArray (int[] arr, int indexFrom, int indexTo) {

        int sum = 0;

        for (int i = indexFrom; i <= indexTo; i++) {
            sum += arr[i];
        }

        return sum;
    }
}
