package lesson_3;

import java.util.Random;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        playGame(9, 3);
    }

    public static void playGame(int maxNumber, int countTries) {

        Random rand = new Random();
        int userNumber;
        int countTry;
        int number;
        int isRepeat;

        do {
            countTry = 1;
            number = rand.nextInt(maxNumber + 1);
            System.out.printf("Попробуйте угадать число от 0 до %d c %d попыток", maxNumber, countTries);
            System.out.println();

            do {
                System.out.printf("Попытка № %d:", countTry);
                System.out.println();
                userNumber = getScannerNumber(0, maxNumber);

                if (number == userNumber) {
                    System.out.println("======================");
                    System.out.println("Поздраляю! Вы угадали!");
                    System.out.println("======================");
                    break;
                } else if (number > userNumber && countTry < countTries) {
                    System.out.println("Загаданное число больше");
                } else if (countTry < countTries) {
                    System.out.println("Загаданное число меньше");
                }
                countTry++;

            } while (countTry <= countTries);

            if (countTry > countTries) {
                System.out.printf("Не угадали. Загаданное число - %d", number);
            }

            System.out.println();
            System.out.println("========================================");
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");

            isRepeat = getScannerNumber(0, 1);

        } while (isRepeat == 1);

        System.out.println("==============");
        System.out.println("Игра окончена.");

    }

    public static int getScannerNumber(int min, int max) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.printf("Введите число от %d до %d", min, max);
            System.out.println();
            int number = scanner.nextInt();

            if (number >= min && number <= max) {
                return number;
            }
        }
    }
}
