import java.util.*;

public class Functions {
    public static void printMyName(String name) {
        System.out.println("Enter Your Name : " + name);
        return;
    }

    public static void printFactorial(int n) {
        int factorial = 1;
        if (n < 0) {
            System.out.println("Invalid Number");
            return;
        }
        for (int i = n; i >= 1; i--) {
            factorial = i * factorial;
        }
        System.out.println(factorial);
         return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        System.out.println("Enter factorial Number");
        int num = sc.nextInt();
        // printMyName(name);
       printFactorial(num);
    }

}
