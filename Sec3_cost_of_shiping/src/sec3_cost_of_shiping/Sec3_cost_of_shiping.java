
package sec3_cost_of_shiping;

import java.util.Scanner;


public class Sec3_cost_of_shiping {

    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Shiping value ");
        int Weight =in.nextInt();
        if (Weight>0 && Weight<1){
            System.out.println("you should pay 3.5 Pounds");
        }
         if (Weight>1 && Weight<3){
            System.out.println("you should pay 5.5 Pounds");
        }
          if (Weight>3 && Weight<10){
            System.out.println("you should pay 8.5 Pounds");
        }
           if (Weight>10 && Weight<20){
            System.out.println("you should pay 10.5 Pounds");
        }
           if (Weight>20){
               System.out.println("The package connot be Shipped");
           }
           if (Weight<1){
               System.out.println("invoild input");
           }
    }
    
}
