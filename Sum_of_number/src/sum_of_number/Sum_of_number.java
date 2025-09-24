
package sum_of_number;

import java.util.Scanner;


public class Sum_of_number {

    
    public static void main(String[] args) {
      Scanner inpout = new Scanner(System.in);
        System.out.println("Enter the number to see the sum \nfrom 1 to that number");
       long n = inpout.nextLong();
       long Sum;
       Sum = n*(n+1)/2;
        System.out.println("the sum is "+Sum);
       
    }
    
}
