package lesson5.homework;

import java.util.Random;
import java.util.Scanner;

public class ConsoleGame1 {

    public static void main(String[] args) {

        ConsoleGame1 cg = new ConsoleGame1();
        Scanner sc = new Scanner(System.in);

        int myGuessedNumber;
        int computerGuessedNumber;
        int minNumber = 1;
        int maxNumber = 1001;
        int myAnswer;

        do {
            System.out.print("Please enter number from 1 to 1000 -> ");
            myGuessedNumber = sc.nextInt();
            if ((myGuessedNumber < 1) || (myGuessedNumber > 1000)) System.out.println("Entered not correct number");
        } while ((myGuessedNumber < 1) || (myGuessedNumber > 1000));

        do {
            computerGuessedNumber = cg.getRandomNumber(minNumber, maxNumber);
            System.out.println("My guessed number = " + myGuessedNumber);
            System.out.println("Computer guessed number = " + computerGuessedNumber);
            System.out.print("Please enter 0 - if computer guessed, 1 - if your number is bigger, 2 - if yor number is smaller -> ");
            myAnswer = sc.nextInt();
            if (myAnswer == 1) minNumber = computerGuessedNumber;
            else if (myAnswer == 2) maxNumber = computerGuessedNumber;
        } while (myAnswer != 0);
        System.out.println("______________________________________________________");
        System.out.println("Computer guessed yor number. The number was " + computerGuessedNumber);
    }

    public int getRandomNumber(int min,int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

}

