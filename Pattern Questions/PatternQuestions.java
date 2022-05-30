public class PatternQuestions {
    public static void main(String[] args) {
        // int n=4;
        // int m=5;

        // Q1 -> Print the Pattern
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *
        
        // Solutin:
        // for(int i=1 ; i<=n; i++){ //outer loop -> print row
        //  for(int j=1 ; j<=m; j++){ //inner loop -> print column
        //   System.out.print("*");
        //  }
        //  System.out.println("");
        // }

         // Q2 -> Print the Pattern
        // * * * * *
        // *       *
        // *       *
        // * * * * *
    
        //  for(int i=1 ; i<=n; i++){ //outer loop -> print row
        //  for(int j=1 ; j<=m; j++){ //inner loop -> print column
        //     if(i==1 || i==n || j==1 || j==m){
        //       System.out.print("*");
        //   }
        //  else{
        //      System.out.print(" ");
        //  }
        //  }
        //  System.out.println("");
        //}

        //Q3 -> Pirnt the Pattern
        // *
        // **
        // ***
        // ****

        // for(int i=1; i<=n ;i++){
        //     for(int j=1; j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // //Q4 -> Pirnt the Pattern
        // // ***
        // // ****
        // // **
        // // *

        // for(int i=n; i>=1 ;i--){
        //     for(int j=1; j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        
        
        //Q3 -> Pirnt the Pattern Inverted half Pyramid
            //       *
            //      ** 
            //     ***
            //    ****

        // for(int i = 1 ; i <=n ; i++ ){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

       //Q6 -> Pritnt the pattern half pyramid with numbers 

            //    1               r1      
            //    12              
            //    123
            //    1234
            //    12345

            
    //    for(int i =1 ;i<=5; i++){
    //        for(int j =1;j<=i;j++){
    //            System.out.print(j);
    //        }
    //        System.out.println();
    //    }

       //Q7 -> Pritnt the pattern Inverted half pyramid with numbers 

       //    12345
       //    1234
       //    123
       //    1                   
       //    12              
            
    //    int n =5;
    //    for(int i =1 ;i<=n; i++){
    //        for(int j =1;j<=n-i+1;j++){
    //            System.out.print(j);
    //        }
    //        System.out.println();
    //    }

    //    Q8 - Print the pattern Floyd's Triangle
    int n=5;
    int number =1 ;
    for(int i = 1 ; i<=n; i++){
        for(int j = 1; j<=i;j++){
            System.out.print(number+" ");
            number++;
        }
        System.out.println();

    }
    }
}

