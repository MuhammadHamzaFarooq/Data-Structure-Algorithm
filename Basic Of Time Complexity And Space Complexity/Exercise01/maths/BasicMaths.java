package maths;

import org.w3c.dom.UserDataHandler;

public class BasicMaths {
    public double average(int num1, int num2, int num3) {
        double avg = (num1 + num2 + num3) / 3;
        return avg;
    }

    public int sumOfAllOddNumbers(int n) {
        int sumOdd = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println("EvenNumber");
            } else {
                sumOdd = sumOdd + i;
            }
        }
        return sumOdd;
    }
}
