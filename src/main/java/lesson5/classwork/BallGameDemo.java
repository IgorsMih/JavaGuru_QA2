package lesson5.classwork;

import java.util.Random;
import java.util.Scanner;

public class BallGameDemo {

    public static void main(String[] args) {
        int[] board = {0, 0, 0};
        Random random = new Random();
        int ballPlace = random.nextInt(3);
        board[ballPlace] = 1;

        System.out.println("\nBall is under one of 3 cups. Try to guess");
        System.out.println("-----------------------------------------");
        System.out.print("Please enter number from 1 to 3 -> ");
        Scanner sc = new Scanner(System.in);
        int  personGuess = sc.nextInt();
        if (board[personGuess - 1] == 1) {
            System.out.print("Number " + personGuess + " is correct. ");
        } else {
            System.out.print("Number " + personGuess + " is not correct. ");
        }
        System.out.println("The ball was under " + (ballPlace + 1) + " cup");
        for (int i = 0; i < board.length; i++) {
            System.out.print("Cup " + (i + 1) + " = " + board[i] + ". ");
        }
        System.out.println("\n-----------------------------------------");
    }

}
