
package decimal_to_hexadecimal_4.pkg11;

import java.util.Scanner;

public class Decimal_to_hexadecimal_411 {

    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        System.out.println("Enter a decimal value: ");
        int dec=input.nextInt();
        
        if (dec<0 || dec>15){
            System.out.println("Invalid input");}
        else{
            if(dec<10)
                System.out.println("The hexadecimal value is: "+dec);
            else {
                char hex=(char)('A'+(dec-10));
                System.out.println("The hex value is: "+hex);
            }
               
        }

        
    }
    
}
