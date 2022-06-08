package maths;

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

    public int greaterNumber(int num1, int num2) {
        int greaterNumber = 0;
        if (num1 > num2) {
            greaterNumber = num1;
        } else if (num2 > num1) {
            greaterNumber = num2;
        } else if (num1 == num2) {
            System.out.println("Equal Number");
        }
        return greaterNumber;
    }

    public double circumferenceOfCircle(double radius) {
        double areaOfCircle = 2 * 2.142 * radius;
        return areaOfCircle;
    }

    public void checkVoteEligibility(int age) {
        if (age > 18) {
            System.out.println(" person is eligible to vote");
        } else {
            System.out.println(" person is not eligible to vote");
        }
    }
}
