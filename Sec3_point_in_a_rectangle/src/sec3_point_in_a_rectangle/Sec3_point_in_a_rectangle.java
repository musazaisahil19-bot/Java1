
package sec3_point_in_a_rectangle;

import java.util.Scanner;


public class Sec3_point_in_a_rectangle {

   
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the point x then Click (Enter) and input the y ");
        double x =in.nextDouble();
        double y =in.nextDouble();
        double width=Math.sqrt((x*x));
        double hight=Math.sqrt((y*y));
        if (width<=5 && hight<=2.5){
            System.out.println("the point ("+x+","+y+") is in the rectangle");
        }else {
             System.out.println("the point ("+x+","+y+") is not in the rectangle");
    }
    
}
}