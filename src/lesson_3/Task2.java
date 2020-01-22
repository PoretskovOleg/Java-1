package lesson_3;

import java.util.Random;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        String[] words = {
            "apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
            "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut",
            "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"
        };

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int index = rand.nextInt(words.length);
        String word = words[index];

        System.out.println("Угадайте загаданное слово!");
        System.out.println("==========================");

        while(true) {
            System.out.println("Ваше слово:");
            String userWord = scan.nextLine();

            if (word.equals(userWord)) {
                System.out.println("======================");
                System.out.println("Поздраляю! Вы угадали!");
                System.out.println("======================");
                break;
            }

            System.out.println("К сожалению Вы не угадали");

            StringBuilder forUser = new StringBuilder();

            int countLetter = 0;

            for (int i = 0; i < word.length() || i < 15; i++) {

                if (
                    i < word.length() &&
                    i < userWord.length() &&
                    word.charAt(i) == userWord.charAt(i)
                ) {

                    forUser.append(word.charAt(i));
                    countLetter++;

                } else {
                    forUser.append("#");
                }
            }

            if(countLetter > 0) {
                System.out.println("Но Вы угадали несколько букв:");
                System.out.println(forUser);
            }
        }
        System.out.println("Игра окончена");
    }
}
