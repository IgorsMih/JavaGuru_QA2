package lecture4.classwork;

public class ArrayDemoMath2 {

    public static void main(String[] args) {
        int[] numbers = {41, 12, 20, 3, 44, 35, 64, 71};
        int min = numbers[0];

        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        System.out.println("The min is " + min);
    }

}
