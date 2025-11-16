
package student_major_and_status4.pkg18;

import java.util.Scanner;

public class Student_major_and_status418 {

    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        System.out.println("Enter two characters");
        String userinput=input.nextLine().toUpperCase();
        
        if (userinput.length() !=2){
            System.out.println("Invalid input");
        return;}
        
        char major=userinput.charAt(0);
        char status=userinput.charAt(1);
        
        String majorname="";
        String statusname="";
        
        
        switch(major){
            case 'M':majorname="Mathmatics"; break;
            case 'C':majorname="Compute Science"; break;
            case 'I':majorname="Information technology"; break;
            default : System.out.println("Invalid input");return;

        }
        
        switch(status){
            case '1': statusname="Freshman"; break;
            case '2': statusname="Sophomore"; break;
            case '3': statusname="Junior"; break;
            case '4': statusname="Senior"; break;
            default : System.out.println("Invalid input");return;
        }
        
        System.out.println(majorname+""+statusname);
            
        
        
       
    }
    
}
