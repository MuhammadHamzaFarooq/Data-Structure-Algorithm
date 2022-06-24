import maths.*;

public class Exercise {
    public static void main(String[] args) {

        // 1. Enter 3 numbers from the user & make a function to print their average.
        // Solution:
        maths.BasicMaths math = new maths.BasicMaths();
         double result = math.average(20, 30, 48);
         System.out.println("Average => : " + result);

        // 2. Write a function to print the sum of all odd numbers from 1 to n
         int oddSum = math.sumOfAllOddNumbers(15);
         System.out.println("Sum of Odd Numbers => : " + oddSum);

        // 3. Write a function which takes in 2 numbers and returns the greater of those
        // two.
         int greaterNo = math.greaterNumber(20, 40);
         System.out.println("Greather no is => " + greaterNo);

        // 4- Write a function that takes in the radius as input and returns the
        // circumference of a circle
         double circumference = math.circumferenceOfCircle(3.5);
         System.out.println("Circumference Of Circle => " + circumference);

        // 5 - Write a function that takes in age as input and returns if that person is
        // eligible
        // to vote or not. A person of age > 18 is eligible to vote.
         math.checkVoteEligibility(18);

        // 6- Write an infinite loop using do while condition.

         math.infiniteLoop();

        // 7-Write a program to enter the numbers till the user wants and at the end it
        // should display the count of positive, negative and zeros entered.

         math.displaySummary();

        // 8 - Two numbers are entered by the user, x and n. Write a function to find
        // the value of one number raised to the power of another i.e. 𝑥 .�

        math.power();

        // 9 - Write a function that calculates the Greatest Common Divisor of 2
        // numbers.

         math.greatestCommonDivisor();

        // 10 - Write a program to print Fibonacci series of n terms where n is input
        // by user :
        // 0 1 1 2 3 5 8 13 21 .....
        // In the Fibonacci series, a number is the sum of the previous 2 numbers that
        // came before it.

        math.fibonacciSequence();


    }

}