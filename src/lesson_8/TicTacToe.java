package lesson_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class TicTacToe extends JFrame {

    public static final int SIZE = 3;
    public static final String CROSS_IMAGE = "images/cross.png";
    public static final String ZERO_IMAGE = "images/zero.png";
    private static final String MESSAGE_FAIL = "Вы проиграли";
    private static final String MESSAGE_WIN = "Вы победили!";
    private static final String MESSAGE_NULL = "Ничья";

    private JButton[] buttons = new JButton[SIZE * SIZE];
    private Random random = new Random();
    private ActionListener actionListener;

    public TicTacToe() {
        setTitle("TicTacToe");
        setBounds(900,200,500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new GridLayout(SIZE, SIZE));

        this.actionListener =  new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String action = e.getActionCommand();
                int index = Character.digit(action.charAt(0), 10);
                stepPerson(buttons[index]);
            }
        };
    }

    public void play(){
        initTable();
        setVisible(true);
    }

    private void initTable() {
        for (int i = 0; i < this.buttons.length; i++) {
            this.buttons[i] = new JButton("");
            add(this.buttons[i]);
            this.buttons[i].setActionCommand("" + i);
            this.buttons[i].addActionListener(this.actionListener);
        }
    }

    private void stepPerson(JButton button) {
        button.setIcon(new ImageIcon(CROSS_IMAGE));
        button.removeActionListener(this.actionListener);
        if (!isEndGame(CROSS_IMAGE)) {
            stepComputer();
        } else {
            removeAllListeners();
        }
    }

    private void stepComputer(){
        int index;
        do {
            index = this.random.nextInt(this.buttons.length);
        } while (this.buttons[index].getIcon() != null);

        this.buttons[index].setIcon(new ImageIcon(ZERO_IMAGE));
        this.buttons[index].removeActionListener(this.actionListener);

        if (isEndGame(ZERO_IMAGE)) {
            removeAllListeners();
        };
    }

    private void removeAllListeners() {
        for (JButton button : buttons) {
           button.removeActionListener(this.actionListener);
        }
    }

    private boolean isEndGame(String image) {

        if (isEndByHorizont(image)) {
            printWin(image);
            return true;
        } else if (isEndByVertical(image)) {
            printWin(image);
            return true;
        } else if (isEndByLeftDiag(image)) {
            printWin(image);
            return true;
        } else if (isEndByRightDiag(image)) {
            printWin(image);
            return true;
        } else if (isFillTable()) {
            setMessage(MESSAGE_NULL);
            return true;
        }

        return false;
    }

    private boolean isFillTable() {
        int count = 0;
        for (int i = 0; i < SIZE * SIZE; i ++) {
            if (this.buttons[i].getIcon() == null) {
                count++;
            }
        }
        return count == 0;
    }

    private void printWin(String image) {
        String message = image.equals(ZERO_IMAGE) ?
                MESSAGE_FAIL : MESSAGE_WIN;

        setMessage(message);
    }

    private void setMessage(String message) {
        this.buttons[4].setText(message);
        this.buttons[4].setBackground(Color.WHITE);
        this.buttons[4].setForeground(Color.RED);
        this.buttons[4].setHorizontalTextPosition(JButton.CENTER);
        this.buttons[4].setVerticalTextPosition(JButton.CENTER);
    }

    private boolean isEndByHorizont(String image) {
        for (int i = 0; i < SIZE * SIZE; i += SIZE) {
            int count = 0;
            for (int j = 0; j < SIZE; j++) {
                if (this.buttons[i + j].getIcon() != null && this.buttons[i + j].getIcon().toString().equals(image)) {
                    count++;
                }
            }
            if (count == SIZE) {
                return true;
            }
        }
        return false;
    }

    private boolean isEndByVertical(String image) {
        for (int i = 0; i < SIZE; i++) {
            int count = 0;
            for (int j = 0; j < SIZE * SIZE; j += SIZE) {
                if (this.buttons[i + j].getIcon() != null && this.buttons[i + j].getIcon().toString().equals(image)) {
                    count++;
                }
            }
            if (count == SIZE) {
                return true;
            }
        }
        return false;
    }

    private boolean isEndByLeftDiag(String image) {
        int count = 0;
        for (int i = 0; i < SIZE * SIZE; i += SIZE + 1) {
            if (this.buttons[i].getIcon() != null && this.buttons[i].getIcon().toString().equals(image)) {
                count++;
            }
        }
        return count == SIZE;
    }

    private boolean isEndByRightDiag(String image) {
        int count = 0;
        for (int i = SIZE -1; i < SIZE * SIZE - (SIZE - 1); i += SIZE - 1) {
            if (this.buttons[i].getIcon() != null && this.buttons[i].getIcon().toString().equals(image)) {
                count++;
            }
        }
        return count == SIZE;
    }
}
