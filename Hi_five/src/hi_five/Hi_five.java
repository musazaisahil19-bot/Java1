
package hi_five;

import java.util.Scanner;


public class Hi_five {

    
    public static void main(String[] args) {
        
     Scanner inpout = new Scanner(System.in);
        System.out.println("enter a number");
      int x = inpout.nextInt();
      if (x%5 ==0 & x%2 ==0 ){System.out.println("Hi five\nHI even");}
      else if(x%5 == 0){
          System.out.println("Hi five");
      }  
      else if (x%2 ==0){
          System.out.println("Hi even");
      }
    }
    
}
