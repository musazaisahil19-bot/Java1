
package convert.hx.to.de;

import java.util.Scanner;

public class ConvertHXToDE {

    public static void main(String[] args) {
       
        System.out.println("Enter a hexadecimal digit (0-9 or A-F) ...");
        Scanner input = new Scanner(System.in);
        String hex = input.nextLine().toUpperCase();
        
       if (hex.length() !=1 || !(hex.charAt(0) >= '0' && hex.charAt(0) <= '9' || hex.charAt(0) >= 'A' && hex.charAt(0) <= 'F')){
           System.out.println("Invalid input !");
       }else {
           int decimal;
           if (Character.isDigit(hex.charAt(0))){
               decimal = hex.charAt(0) - '0';
           }else {
               decimal = hex.charAt(0) - 'A' + 10;
           }
           System.out.println("Decimal value :" + decimal);
       }
    }
    
}
