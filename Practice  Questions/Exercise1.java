import java.io.ObjectOutputStream.PutField;
import java.util.Scanner;

public class Exercise1 {
  // 1. Enter 3 numbers from the user & make a function to print their average
  public static double average(int num1, int num2, int num3) {
    int sum = num1 + num2 + num3;
    double average = sum / 3;
    return average;
  }

  // 2. Write a function to print the sum of all odd numbers from 1 to n.
  public static int sumOfOddNumber(int n) {
    int sum = 0;
    for (int i = 0; i <= n; i++) {
      if (i % 2 == 1) {
        sum += i;
      }
    }
    return sum;
  }

  // 3. Write a function which takes in 2 numbers and returns the greater of those
  // two
  public static void greaterNumber(int num1, int num2, int num3) {
    if (num1 >= num2 && num1 >= num3) {
      System.out.println(num1 + " is greater Number");
    } else if (num2 >= num1 && num2 >= num3) {
      System.out.println(num2 + " is greater Number");
    } else {
      System.out.println(num3 + " is greater Number");
    }
  }

  // 4. Write a function that takes in the radius as input and returns the
  // circumference of a circle.
  public static double circumferenceOfCircle(double r) {
    double circumference = 2 * 3.142 * r;
    return r;
  }

  // Write a function that takes in age as input and returns if that person is
  // eligible to vote or not. A person of age > 18 is eligible to vote.
  public static void checkEligibleForVote(int age) {
    if (age >= 18) {
      System.out.println("This person is eligible for vote");
    } else {
      System.out.println("This person not is eligible for vote because age is " + age);
    }
  }

  // 6. Write an infinite loop using do while condition.
  public static void infiniteLoop() {
    int n = 1;
    do {
      System.out.println("Loop is Start");
    } while (n >= 1);
    System.out.println("infinite Loop");
    n++;
  }

  // 7. Write a program to enter the numbers till the user wants and at the end it
  // should display the count of positive, negative and zeros entered.

  // 8. Two numbers are entered by the user, x and n. Write a function to find the
  // value of one number raised to the power of another i.e. 𝑥 .

  public static double power(int n, int x) {
    double power = Math.pow(x, n);
    return power;
  }

  // 9. Write a function that calculates the Greatest Common Divisor of 2 numbers.
  // (BONUS)


  // 10 . Write a program to print Fibonacci series of n terms where n is input by user :
  // 0 1 1 2 3 5 8 13 21 .....
  // In the Fibonacci series, a number is the sum of the previous 2 numbers that
  // came before it
  public static void fibonacciSeries(int n){
    int f = 0;
    int s = 1 ;
    int next ;
    for(int i = 0 ; i<n ; i++){
      if(i<=1){
        next = i;
      }
      else{
        next = f +s;
        f = s;
        s = next;
      }
      System.out.print(next + " ");
    }
    
  }


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter First Number");
    int num1 = sc.nextInt();
    System.out.println("Enter First Number");
    int num2 = sc.nextInt();
    System.out.println("Enter First Number");
    int num3 = sc.nextInt();
    double result = average(num1, num2, num3);
    System.out.println("Average is : " + result);
  }

}
