
package monetrary_units4.pkg26;

import java.util.Scanner;

public class Monetrary_units426 {

    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       
        System.out.println("Enter an amount in dollars and cents: ");
        String amount= input.nextLine();
        
        int dotindex=amount.indexOf('.');// finding the decimal point
        
        int dollars=Integer.parseInt(amount.substring(0, dotindex));
        int cents=Integer.parseInt(amount.substring(dotindex+1));
        
        int totalcents=dollars*100+cents;
        int remainingcents=totalcents;
        
        int numberofdollars=remainingcents/100;
        remainingcents %=100;
        
        int quarters= remainingcents/25;
        remainingcents %=25;
        
        int dimes =remainingcents/10;
        remainingcents %=10;
        
        int nickles=remainingcents/5;
        remainingcents %=5;
        
        int pennies= remainingcents;
        
        System.out.println("Your amount: "+amount+"consists of: ");
        System.out.println("number of quarter: "+quarters);
        System.out.println("number of dimes: "+dimes);
        System.out.println("number of nickles: "+nickles);
        System.out.println("number of pennies: "+pennies);
                
     
        
        
        
        
        
    }
    
}
