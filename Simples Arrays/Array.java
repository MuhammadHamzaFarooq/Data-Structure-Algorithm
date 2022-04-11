import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Method one for creating array in java
        int[] integerArray = new int[10];

        // Tiversing array with for loop
        for(int i =0 ; i<=integerArray.length ;i++){
        System.out.println(integerArray[i]);
        }
        
        int marks[] = {10,30,49};
        
        // Tiversing array with for loop
        for(int i =0 ; i<=marks.length  ;i++){
            System.out.println(marks[i]);
        }
        
        System.out.println("Enter Array Size");
        int size = sc.nextInt();

        String names[] = new String[size] ;

        // Input name in array with for loop
        for(int i =0 ; i<=size;i++){
            System.out.println("Enter your Name");
            names[i] = sc.nextLine(); 
        }  

          // Tiversing array with for loop
          for(int i =0 ; i<=names.length; i++){
            System.out.println("All names is "+names[i] +" is index is "+i);
        }
      
        //Q2 Find the maximum & minimum number in an array of integers.
        // [HINT : Read about Integer.MIN_VALUE & Integer.MAX_VALUE in Java]
 
           
        // Tiversing array with for loop
        for(int i =0 ; i<=marks.length  ;i++){
            System.out.println();
            // System.out.println("Maximum marsk is "+Integer.MIN_VALUE(marks[i]));
        }



            
    }

  


}
