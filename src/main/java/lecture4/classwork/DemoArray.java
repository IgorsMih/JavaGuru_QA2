package lecture4.classwork;

import java.util.Arrays;

public class DemoArray {

    public static void main(String[] args) {
        arrayMethod1();
        arrayMethod2();
    }

    public static void arrayMethod1() {
        int[] leapYear = new int[3];
        System.out.println(Arrays.toString(leapYear));
        leapYear[0] = 2020;
        leapYear[1] = 2021;
        leapYear[2] = 2022;
        System.out.println(Arrays.toString(leapYear));
    }

    public static void arrayMethod2() {
        int[] leapYear = {3020, 3021, 3022};
        System.out.println(Arrays.toString(leapYear));
    }

}
