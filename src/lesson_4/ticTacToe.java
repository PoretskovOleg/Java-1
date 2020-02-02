package lesson_4;

import java.util.Random;
import java.util.Scanner;

public class ticTacToe {

    private static final int        SIZE = 5;
    private static final int        COUNT_SYMBOL_WIN = 4;
    private static final char       EMPTY_DOT = '•';
    private static final char       DOT_ZERO = 'O';
    private static final char       DOT_CROSS = 'X';
    private static final String     MARGIN = "  ";
    private static final String     HEADER_MARGIN = "   ";
    private static final String     MESSAGE_WIN = "Отлично! Вы победили!!!";
    private static final String     MESSAGE_FAIL = "Увы, вы проиграли.";
    private static final String     MESSAGE_EQUAL = "Ничья";

    private static char[][]         table;
    private static Scanner          scanner = new Scanner(System.in);
    private static Random           random = new Random();

    public static void main(String[] args) {

        initTable();
        printTable();
        playGame();
    }

    private static void playGame() {
        while (true) {
            stepUser();

            if (isEnd(DOT_CROSS, MESSAGE_WIN)) {
                break;
            }

            stepComp();

            if (isEnd(DOT_ZERO, MESSAGE_FAIL)) {
                break;
            }
        }

        System.out.println("Игра окончена.");
    }

    private static boolean isEnd(char symbol, String message) {
        if (checkWin(symbol)){
            System.out.println(message);
            return true;
        }

        if (isTableFill()) {
            System.out.println(MESSAGE_EQUAL);
            return true;
        }

        return false;
    }

    private static boolean isTableFill() {

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (table[i][j] == EMPTY_DOT) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean checkWin(char symbol) {

        if (winByRowOrCol(symbol)) {
            return true;
        } else if (winByDiag(symbol)) {
            return true;
        }
        return false;
    }

    private static boolean winByDiag(char symbol) {
        int countFillLeftDiag, countFillRightDiag;

        for (int i = 0; i <= SIZE - COUNT_SYMBOL_WIN; i++) {
            countFillLeftDiag = 0;
            countFillRightDiag = 0;

            for (int k = i; k < i + COUNT_SYMBOL_WIN; k++) {
                if (table[k][k] == symbol) {
                    countFillLeftDiag++;
                }

                if (table[k][SIZE - 1 - k] == symbol) {
                    countFillRightDiag++;
                }
            }

            if (countFillLeftDiag == COUNT_SYMBOL_WIN || countFillRightDiag == COUNT_SYMBOL_WIN) {
                return true;
            }
        }

        return false;
    }

    private static boolean winByRowOrCol(char symbol) {
        int countFillRow, countFillCol;

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j <= SIZE - COUNT_SYMBOL_WIN; j++) {
                countFillRow = 0;
                countFillCol = 0;

                for (int k = j; k < j + COUNT_SYMBOL_WIN; k++) {
                    if (table[i][k] == symbol) {
                        countFillRow++;
                    }

                    if (table[k][i] == symbol) {
                        countFillCol++;
                    }
                }

                if (countFillCol == COUNT_SYMBOL_WIN || countFillRow == COUNT_SYMBOL_WIN) {
                    return true;
                }
            }
        }

        return false;
    }

    private static void stepComp() {
        System.out.println("Ход компьютера");
        int row, col;

        do {
            row = random.nextInt(SIZE);
            col = random.nextInt(SIZE);
        } while (!checkStep(row, col));

        table[row][col] = DOT_ZERO;
        printTable();
    }

    private static void stepUser() {
        System.out.println("Ваш ход");
        int row, col;
        while (true) {
            System.out.print("Введите номер строки: ");
            row = scanner.nextInt() - 1;
            System.out.print("Введите номер столбца: ");
            col = scanner.nextInt() - 1;
            if (checkStep(row, col)) {
                break;
            } else {
                System.out.println("Неверный ход. Попробуйте еще раз.");
            }
        }
        table[row][col] = DOT_CROSS;
        printTable();
    }

    private static boolean checkStep(int row, int col) {
        return  row >= 0 && row < SIZE &&
                col >= 0 && col < SIZE &&
                table[row][col] == EMPTY_DOT;
    }

    private static void printTable() {
        printHeader();
        printBody();
    }

    private static void printBody() {
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i+1);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(MARGIN + table[i][j]);
            }
            System.out.println();
        }
    }

    private static void printHeader() {
        System.out.print(HEADER_MARGIN);
        for (int i = 1; i <= SIZE; i++) {
            System.out.print(i + MARGIN);
        }
        System.out.println();
    }

    private static void initTable() {
        table = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                table[i][j] = EMPTY_DOT;
            }
        }
    }
}
