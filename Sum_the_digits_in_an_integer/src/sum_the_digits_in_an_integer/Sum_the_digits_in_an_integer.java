
package sum_the_digits_in_an_integer;

import java.util.Scanner;


public class Sum_the_digits_in_an_integer {

    
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the number between 0 and 1000");
        int num =in.nextInt();
        int digit1=num/100;
        int digit=num%100;
        int digit2=digit/10;
        int digit3=num%10;
        System.out.println("the sum of the digit is "+(digit1+digit2+digit3));
        
    }
    
}
