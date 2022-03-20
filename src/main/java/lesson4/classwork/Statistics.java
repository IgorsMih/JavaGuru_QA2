package lesson4.classwork;

public class Statistics {

    public void maxValue(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        System.out.println("Maximum value = " + max);
    }

    public void minValue(int[] numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (min >= numbers[i]) {
                min = numbers[i];
            }
        }
        System.out.println("Minimum value = " + min);
    }

    public void averageValue(int[] numbers) {
        double average;
        int avr = 0;
        for (int number : numbers) {
            avr = avr + number;
        }
        average = avr / numbers.length;
        System.out.println("Average value = " + average);
    }

}
