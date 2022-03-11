package lesson5.classwork;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BallGameDemo {

    public static void main(String[] args) {

        int[] board = {0, 0, 0};
        int personGuess;
        Random random = new Random();
        int ballPlace = random.nextInt(3);
        board[random.nextInt(3)] = 1;

        System.out.println("\nBall is under one of 3 cups. Try to guess");
        System.out.println("-----------------------------------------");
        do {
            System.out.print("Please enter number from 1 to 3 -> ");
            Scanner sc = new Scanner(System.in);
            personGuess = sc.nextInt();
        } while ((personGuess < 1) || (personGuess > 3) );

        if (board[personGuess - 1] == 1) {
            System.out.print("Number " + personGuess + " is correct. ");
        } else {
            System.out.print("Number " + personGuess + " is not correct. ");
        }
        System.out.println("The ball was under " + (ballPlace + 1) + " cup");
        System.out.println("-----------------------------------------");
        System.out.println(Arrays.toString(board));
    }

}
