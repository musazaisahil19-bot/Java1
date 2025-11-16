
package proccessing_string4.pkg20;

import java.util.Scanner;

public class Proccessing_String420 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String text=input.nextLine();
        
        int length=text.length();
        char firstchar=text.charAt(0);
        
        System.out.println("Length of the String: "+length);
        System.out.println("First character is: "+firstchar);
    }
    
}
