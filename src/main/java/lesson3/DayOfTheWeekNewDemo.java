package lesson3;

public class DayOfTheWeekNewDemo {

    public static void main(String[] args) {
        DayOfTheWeekNew dayOfTheWeekNew = new DayOfTheWeekNew();
        System.out.println("Day with Number = 1 is " + dayOfTheWeekNew.detect(1));
        System.out.println("Day with Number = 2 is " + dayOfTheWeekNew.detect(2));
        System.out.println("Day with Number = 3 is " + dayOfTheWeekNew.detect(3));
        System.out.println("Day with Number = 4 is " + dayOfTheWeekNew.detect(4));
        System.out.println("Day with Number = 5 is " + dayOfTheWeekNew.detect(5));
        System.out.println("Day with Number = 6 is " + dayOfTheWeekNew.detect(6));
        System.out.println("Day with Number = 7 is " + dayOfTheWeekNew.detect(7));
        System.out.println("Day with Number = 10 is " + dayOfTheWeekNew.detect(10));
    }

}
