package lesson5.homework;

import java.util.Random;
import java.util.Scanner;

public class ConsoleGame2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int myGuessedNumber;
        int computerGuessedNumber;
        int minNumber = 1;
        int maxNumber = 101;

        computerGuessedNumber = random.nextInt(maxNumber - minNumber);
        System.out.println("Computer guessed number from 1 to 100. You need to guess it.");
        System.out.println("------------------------------------------------------------");

        do {
            System.out.print("Please enter your number from " + minNumber + " to " + (maxNumber - 1) + " -> ");
            myGuessedNumber = sc.nextInt();
            if ((myGuessedNumber < minNumber) || (myGuessedNumber >= maxNumber)) {
                System.out.println("Entered not correct number");
            }
            else {
                if (myGuessedNumber != computerGuessedNumber) {
                    if (myGuessedNumber < computerGuessedNumber) {
                        System.out.println("Not correct. Your number is less than correct number");
                        minNumber = myGuessedNumber + 1;
                    }
                    if (myGuessedNumber > computerGuessedNumber){
                        System.out.println("Not correct. Your number is more than correct number");
                        maxNumber = myGuessedNumber;
                    }
                } else {
                    System.out.println("---------------------------------------------------");
                    System.out.println("Correct! The computer number was " + computerGuessedNumber);
                }
            }
        } while ((myGuessedNumber < minNumber) || (myGuessedNumber >= maxNumber));
    }

}
