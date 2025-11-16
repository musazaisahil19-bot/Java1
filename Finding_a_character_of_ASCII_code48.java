
package finding_a_character_of_ascii_code4.pkg8;

import java.util.Scanner;

public class Finding_a_character_of_ASCII_code48 {

    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       
        System.out.println("Enter an ASCII code: ");
        int code=input.nextInt();
        
        char character=(char)code;
        
        System.out.println("The character for ASCII code"+code+"is"+character);
    }
    
}
