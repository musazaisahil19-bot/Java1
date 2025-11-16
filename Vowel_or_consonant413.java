
package vowel_or_consonant4.pkg13;

import java.util.Scanner;

public class Vowel_or_consonant413 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter a letter: ");
        String str=input.next();
        
        if(str.length() !=1){
            System.out.println(str+"is an invalid input");
            return;
        }
        char ch=str.charAt(0);
        if(ch=='a' || ch=='e'|| ch=='i'|| ch=='o' || ch=='u'){
            System.out.println(str+"is a vowel");
        }
        else {
            System.out.println(str+"is consonat");
        }
        
    }
    
}
