package lesson3;

public class SignComparatorTest {

    public static void main(String[] args) {
        SignComparator comparator = new SignComparator();
        System.out.println(comparator.compare(12));
        System.out.println(comparator.compare(-12));
        System.out.println(comparator.compare(0));
    }

}
