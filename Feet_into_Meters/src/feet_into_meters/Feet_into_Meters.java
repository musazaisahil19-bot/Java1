
package feet_into_meters;

import java.util.Scanner;


public class Feet_into_Meters {

    
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("convert feet into meter prees 1"
                + "\nconvert meter to feet press 2");
       int a =in.nextInt();
       switch(a){
           case 1:System.out.println("enter the feet value "); 
       double feet = in.nextDouble();
       double meter = 0.305*feet;
               System.out.println(meter+"meters");
               break;
           case 2:System.out.println("enter the meter value");
       double meter1 = in.nextDouble();
       double feet1 =meter1/0.305;
               System.out.println(feet1);
       }
    }
    
}
