package lesson4.classwork;

public class DemoArrayPrinting {
    public static void main(String[] args) {
        String[] alphabet = new String[5];

        alphabet[0] = "A";
        alphabet[1] = "B";
        alphabet[2] = "C";
        alphabet[3] = "D";
        alphabet[4] = "E";

        for (int i = 0; i < 5; i++) {
            System.out.println("This is element with index " + i + " and value " + alphabet[i]);
        }
    }

}
