
package check_ssn4.pkg21;

import java.util.Scanner;

public class Check_SSN421 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a ssn:  ");
        String ssn=input.nextLine();
        
        boolean isvalid=ssn.length()==11 && 
                Character.isDigit(ssn.charAt(0))&&
                Character.isDigit(ssn.charAt(1))&&
                Character.isDigit(ssn.charAt(2))&&
                ssn.charAt(3)=='-'&&
                Character.isDigit(ssn.charAt(4))&&
                Character.isDigit(ssn.charAt(5))&&
                ssn.charAt(6)=='-'&&
                  Character.isDigit(ssn.charAt(7))&&
                  Character.isDigit(ssn.charAt(8))&&
                  Character.isDigit(ssn.charAt(9))&&
                  Character.isDigit(ssn.charAt(10));
        
        if(isvalid){
            System.out.println(ssn+" is a valid social secuirity number.");
        }
        else{
            System.out.println(ssn+" Invalid Social sequirity number");
        }
                
                
    }
    
}
