package lecture5.homework;

import java.util.Random;
import java.util.Scanner;

public class ConsoleGame1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int myGuessedNumber;
        int computerGuessedNumber;
        int minNumber = 1;
        int maxNumber = 1001;
        int myAnswer;
        boolean correctAnswer;

        do {
            System.out.println("You need to enter number from 1 to 1000. Computer need to guess it.");
            System.out.println("-------------------------------------------------------------------");
            System.out.print("Please enter number from 1 to 1000 -> ");
            myGuessedNumber = sc.nextInt();
            if ((myGuessedNumber < 1) || (myGuessedNumber > 1000)) System.out.println("Entered not correct number");
        } while ((myGuessedNumber < 1) || (myGuessedNumber > 1000));

        do {
            computerGuessedNumber = random.nextInt(maxNumber - minNumber) + minNumber;
            System.out.println("My guessed number = " + myGuessedNumber);
            System.out.println("Computer guessed number = " + computerGuessedNumber);

            correctAnswer = false;
            do {
                System.out.print("Please enter 0 - if computer guessed, 1 - if your number is bigger, 2 - if your number is smaller -> ");
                myAnswer = sc.nextInt();
                if (((myAnswer == 1) && (myGuessedNumber < computerGuessedNumber)) ||
                ((myAnswer == 2) && (myGuessedNumber > computerGuessedNumber))) {
                    System.out.println("Please enter correct answer");
                } else correctAnswer = true;
            } while (!correctAnswer);

            if (myAnswer == 1) minNumber = computerGuessedNumber;
            if (myAnswer == 2) maxNumber = computerGuessedNumber;
        } while (myAnswer != 0);
        System.out.println("______________________________________________________");
        System.out.println("Computer guessed yor number. The number was " + computerGuessedNumber);
    }

}

