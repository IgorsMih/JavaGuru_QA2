package lecture5.classwork;

import java.util.Scanner;

public class ShutUpAndTakeMyMoney {

    public static void main(String[] args) {

        int[] euros = {2, 1};
        int[] cents = {50, 20, 10, 5, 2, 1};
        int[] eurosCount = {0, 0};
        int[] centsCount = {0, 0, 0, 0, 0, 0};

        System.out.println("\nThe program calculate which coins and how many of them it will give you back");
        System.out.println("----------------------------------------------------------------------------");
        System.out.print("Please enter amount -> ");
        Scanner sc = new Scanner(System.in);
        int amountOfMoney = sc.nextInt();
        int amountOfEuros = amountOfMoney / 100;
        int amountOfCents = amountOfMoney % 100;

        for (int i = 0; i < euros.length; i++) {
            if (amountOfEuros / euros[i] > 0) {
                eurosCount[i] = amountOfEuros / euros[i];
                amountOfEuros = amountOfEuros % euros[i];
            }
        }
        for (int i = 0; i < cents.length; i++) {
            if (amountOfCents / cents[i] > 0) {
                centsCount[i] = amountOfCents / cents[i];
                amountOfCents = amountOfCents % cents[i];
            }
        }

        System.out.println("----------------------------------------------------------------------------");
        for (int i = 0; i < euros.length; i++) {
            if (eurosCount[i] > 0) {
                System.out.println("Number of " + euros[i] + " EUR = " + eurosCount[i]);
            }
        }
        for (int i = 0; i < cents.length; i++) {
            if (centsCount[i] > 0) {
                System.out.println("Number of " + cents[i] + " cents = " + centsCount[i]);
            }
        }
    }

}
