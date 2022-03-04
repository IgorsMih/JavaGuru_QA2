package lecture4.classwork;

public class DemoWhileLoops {

    public static void main(String[] args) {
        int i = 0;
        while (i < 50) {
            System.out.println("Element i= " + i);
            i++;
            if (i == 10) {
                break;
            }
        }
        int index = 0;
        do {
            System.out.println("Element i= " + index);
            index++;
        } while (index<5);
    }

}