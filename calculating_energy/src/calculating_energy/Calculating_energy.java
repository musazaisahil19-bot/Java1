
package calculating_energy;

import java.util.Scanner;


public class Calculating_energy {

   
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the amount of water in kilograms :");
        double amount =in.nextDouble();
        System.out.println("Enter the initial temperature :");
        double initial =in.nextDouble();
        System.out.println("Enter the final temperature :");
         double final_tum =in.nextDouble();
         double energy=amount*(final_tum - initial) *4184;
         System.out.println("the energy nedded is: "+energy+"jouls");
    }
    
}
