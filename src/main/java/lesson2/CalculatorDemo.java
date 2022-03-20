package lesson2;

public class CalculatorDemo {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Sum = " + calculator.sum(10, 20));
        System.out.println("Subtraction = " + calculator.subtraction(20, 10));
        System.out.println("Multiplication = " + calculator.multiplication(10, 5));
        System.out.println("Division = " + calculator.division(30, 5));
    }
}
