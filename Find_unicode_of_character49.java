
package find_unicode_of_character4.pkg9;

import java.util.Scanner;

public class Find_unicode_of_character49 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter a character");
        char ch=input.next().charAt(0);
        
        int unicode=(int)ch;
        System.out.println("The unicode for the character of"+ch+"is"+unicode);
    }
    
}
