package lesson4.homework;

import java.util.Random;

public class ArrayService {

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public void fillRandomly(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101);
        }
    }

    public void printArray(int[] array) {
        for (int j : array) {
            System.out.println("Array element = " + j);
        }
    }

    public int sum(int[] array) {
        int sum = 0;
        for (int j : array) {
            sum = sum + j;
        }
        return sum;
    }

    public double avg(int[] array) {
        double sum = 0;
        for (int j : array) {
            sum = sum + j;
        }
        if (sum == 0) return 0;
        else return Math.round((sum / array.length) * 100.0) / 100.0;
    }

}
