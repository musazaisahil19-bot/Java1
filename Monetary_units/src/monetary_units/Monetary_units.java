
package monetary_units;

import java.util.Scanner;


public class Monetary_units {

    
    public static void main(String[] args) {
        System.out.println("Please Enter the Dollar amount");
        Scanner inpout = new Scanner(System.in);
        int dollar = inpout.nextInt();
        int cent = dollar * 100;   
        int quarter = dollar * 4;
        int dimes = dollar * 10;
        int nickels = dollar *20;
        
        System.out.println(" cent = "+cent+  "\n dimes = "+dimes+"\n quarter = "+quarter+"\n nickels = "+nickels);
        
    }
    
}
