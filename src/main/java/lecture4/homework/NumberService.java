package lecture4.homework;

public class NumberService {

    public int rangeSum(int start, int finish) {
        int sum = 0;

        if (start < finish) {
            for (int i = start; i <= finish; i++) {
                sum = sum + i;
            }
        } else if (start > finish) {
            for (int i = start; i >= finish; i--) {
                sum = sum + i;
            }
        } else sum = start;

        return sum;
    }

    public int rangeEvenCount(int start, int finish) {
        int evenSum = 0;

        if (start < finish) {
            for (int i = start; i <= finish; i++) {
                if (i % 2 == 0)  evenSum += 1;
            }
        } else if (start > finish) {
            for (int i = start; i >= finish; i--) {
                if (i % 2 == 0)  evenSum += 1;
            }
        } else if (start % 2 == 0)  evenSum = 1;

        return evenSum;
    }

}
