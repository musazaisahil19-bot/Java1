
package Even_or_Odd_Numbers ;

import java.util.Scanner;


public class Even_or_Odd_Numbers {

    
    public static void main(String[] args) {
  Scanner inpout = new Scanner(System.in) ;     
        System.out.println("enter the number");  
  int number = inpout.nextInt();
    
     if (number % 2 == 0 ) {
         System.out.println("number is even");
     }
     else  {
         System.out.println("number is odd");
     }
   }
    
}
