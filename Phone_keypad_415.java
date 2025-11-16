
package phone_keypad_4.pkg15;

import java.util.Scanner;

public class Phone_keypad_415 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a letter");
        String str=input.next();
        
        if(str.length() !=1){
            System.out.println("Invalid input");
        }
        
        char ch=Character.toUpperCase(str.charAt(0));
        
        int number;
        
        if(ch>='A' && ch<='C'){
            number =2;}
        else if(ch>='D' && ch<='F')
            number =3;
         else if(ch>='G' && ch<='I')
            number =4;
         else if(ch>='J' && ch<='L')
            number =5;
         else if(ch>='M' && ch<='O')
            number =6;
         else if(ch>='P' && ch<='S')
            number =7;
         else if(ch>='T'&& ch<='V')
            number =8;
         else if(ch>='W' && ch<='Z')
            number =9;
         else {
             System.out.println(ch+"is Invalid input");
             return;
         }
        System.out.println("The corresponding number is: "+number);
    }
    
}
