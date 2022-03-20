package lesson4.homework;

import java.util.Scanner;

public class CalculatorDemo {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input number 1 -> ");
        int consoleNumber1 = scanner.nextInt();
        System.out.print("Please input number 2 -> ");
        int consoleNumber2 = scanner.nextInt();
        System.out.print("Please input action number (1-Sum, 2-Subtract, 3-Multiply, 4-Divide ) -> ");
        int action = scanner.nextInt();
        System.out.println("------------------------------------------------------------------------");

        switch (action) {
            case 1 -> System.out.println("Sum = " + calculator.sum(consoleNumber1, consoleNumber2));
            case 2 -> System.out.println("Subtraction = " + calculator.subtraction(consoleNumber1, consoleNumber2));
            case 3 -> System.out.println("Multiplication = " + calculator.multiplication(consoleNumber1, consoleNumber2));
            case 4 -> System.out.println("Division = " + calculator.division(consoleNumber1, consoleNumber2));
            default -> System.out.println("ERROR - Entered not correct action number");
        }
    }

}
