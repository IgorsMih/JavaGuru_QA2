package lesson4.homework;

import java.util.Scanner;

public class NumberServiceDemo {

    public static void main(String[] args) {
        NumberService numberService = new NumberService();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input first number -> ");
        int firstNumber = scanner.nextInt();
        System.out.print("Please input second number -> ");
        int secondNumber = scanner.nextInt();
        System.out.println("-----------------------------");

        System.out.println("Sum of numbers from " + firstNumber + " to " + secondNumber + " = " +
                numberService.rangeSum(firstNumber, secondNumber));

        System.out.println("Number of even numbers from " + firstNumber + " to " + secondNumber + " = " +
                numberService.rangeEvenCount(firstNumber, secondNumber));
    }

}
