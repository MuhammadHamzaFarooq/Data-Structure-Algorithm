import maths.*;

public class Exercise {
    public static void main(String[] args) {

        // 1. Enter 3 numbers from the user & make a function to print their average.
        // Solution:
        maths.BasicMaths math = new maths.BasicMaths();
        double result = math.average(20, 30, 48);
        System.out.println("Average => : " + result);

        // 2. Write a function to print the sum of all odd numbers from 1 to n
        int oddSum =    math.sumOfAllOddNumbers(15);
        System.out.println("Sum of Odd Numbers => : "+oddSum);
        
    }

}