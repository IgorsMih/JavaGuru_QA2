package lesson2;

import java.util.Random;

public class Exercise1 {
    public static void main(String[] args) {
//        String name = "Igor";
//        System.out.println("Helol, my name is " + name);
//        int a = 10;
//        int b = 4;
//        int result = a + b;
//        System.out.println("result = " + (a / (double) b));
        Random randomGen = new Random();
        int randomNumber1 = randomGen.nextInt(101);
        int randomNumber2 = randomGen.nextInt(101);
        int randomNumber3 = randomGen.nextInt(101);
        System.out.println("Your Random Number 1 is " + randomNumber1);
        System.out.println("Your Random Number 2 is " + randomNumber2);
        System.out.println("Your Random Number 3 is " + randomNumber3);
        System.out.println("---------------------------------");
        System.out.println("Your Sum of Random Numbers is " + (randomNumber1 + randomNumber2 + randomNumber3));
    }
}
