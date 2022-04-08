import java.util.*;

public class Functions {
    public static void printMyName(String name) {
        System.out.println("Enter Your Name : "+name);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
     printMyName(name);
    }
}
