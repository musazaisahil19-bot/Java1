
package celsius_to_fahrenhit;

import java.util.Scanner;



public class Celsius_to_Fahrenhit {

    
    public static void main(String[] args) {
      Scanner inpout = new Scanner(System.in);
        System.out.println("Enter the degree in Celsius "); 
        
        double Celsius = inpout.nextDouble();
        double Fahrenhit;
         Fahrenhit = (9/5d)*Celsius + 32;
        
        System.out.println("the degree in Fahrenhit is " + Fahrenhit);
    }
    
}
