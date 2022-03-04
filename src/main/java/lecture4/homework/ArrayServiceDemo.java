package lecture4.homework;

import java.util.Scanner;

public class ArrayServiceDemo {

    public static void main(String[] args) {
        ArrayService arrayService = new ArrayService();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input length of Array -> ");
        int arrayLength = scanner.nextInt();
        System.out.println("---------------------------------------------------");
        int[] array = arrayService.createArray(arrayLength);
        if (array.length == arrayLength) System.out.println("Array is created successfully");
        System.out.println("---------------------------------------------------");
        System.out.println("Filling array with random numbers between 0 and 100");
        arrayService.fillRandomly(array);
        System.out.println("----------------------------------------------------");
        System.out.println("Printing array");
        System.out.println("----------------------------------------------------");
        arrayService.printArray(array);
        System.out.println("----------------------------------------------------");
        System.out.println("Sum of all array elements = " + arrayService.sum(array));
        System.out.println("----------------------------------------------------");
        System.out.println("Average of all array elements = " + arrayService.avg(array));
    }

}
