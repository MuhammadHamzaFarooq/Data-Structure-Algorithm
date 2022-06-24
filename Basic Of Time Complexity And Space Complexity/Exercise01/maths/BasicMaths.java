package maths;

import java.util.*;

import javax.lang.model.util.ElementScanner14;
import javax.naming.NamingException;

import java.math.*;;

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

    public void infiniteLoop() {
        int start = 0;
        do {
            System.out.println("Infinite Loop!!!");
            start++;
        } while (start > 0);
    }

    public void displaySummary() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Total Number Length");
        int size = sc.nextInt();

        System.out.print("Enter the number of elements you want to store: ");
        int[] numbers = new int[size];

        // Assigning Value in Array
        for (int j = 0; j < size; j++) {
            numbers[j] = sc.nextInt();
        }

        int positiveCount = 0;
        int negativeCount = 0;
        int zerosCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= 1) {
                positiveCount += 1;
            } else if (numbers[i] < 0) {
                negativeCount += 1;
            } else if (numbers[i] == 0) {
                zerosCount += 1;
            }
        }

        System.out.println("Positive Count " + positiveCount);
        System.out.println("Negative Count " + negativeCount);
        System.out.println("Zero Count " + zerosCount);
    }

    public void power() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Base Number");
        int x = sc.nextInt();

        System.out.println("Enter Power Number");
        int n = sc.nextInt();

        double power = Math.pow(x, n);

        System.out.println("X ^ n is => " + power);
    }

    public void greatestCommonDivisor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number1");
        int num1 = sc.nextInt();

        System.out.println("Enter Number2");
        int num2 = sc.nextInt();

        while(num1 != num2){
             if(num1>num2){
                num1 = num1 - num2;
             }
             else{
                num2 = num2 - num1;
             }
        }
        // int firstNumberDivisors[] = new int[20];
        // int secondtNumberDivisors[] = new int[20];
        // int common[] = new int[20];

        // for (int i = 1; i <= 20; i++) {
        //     if (i % num1 == 0) {
        //         firstNumberDivisors[i] += i;
        //     }
        // }

        // for (int i = 1; i <= 20; i++) {
        //     if (i % num2 == 0) {
        //         secondtNumberDivisors[i] += i;
        //     }
        // }

        // for (int j = 0; j < firstNumberDivisors.length; j++) {
        //     if (firstNumberDivisors[j] == secondtNumberDivisors[j]) {
        //         common[j] += firstNumberDivisors[j];
        //     }

        // }

        System.out.println("Common => "+num2);
    }

    // FibonacciSeries => 0  1  1  2  
    public void fibonacciSequence(){
        int first = 0;
        int second = 1 ;
        int third ;
        System.out.print(first + " "+second);
        for(int i = 1 ; i <= 10 ; i++ ){   
            third = first + second;
            System.out.print(" "+ third + " ");
            first = second;
            second = third;
        }

    
    }


}
