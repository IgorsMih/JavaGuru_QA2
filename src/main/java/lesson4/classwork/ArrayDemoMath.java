package lesson4.classwork;

public class ArrayDemoMath {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 0, 3, 4, 5, 6, 7};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Numbers[" + i + "] = " + numbers[i] + " and Sum is " + sum);
            sum = sum + numbers[i];
        }
        System.out.println("The sum is " + sum);
    }

}
