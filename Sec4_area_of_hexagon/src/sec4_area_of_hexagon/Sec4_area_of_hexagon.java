
package sec4_area_of_hexagon;

import java.util.Scanner;


public class Sec4_area_of_hexagon {

    
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the side ");
        double s =in.nextDouble();
        double area =(6*s*s)/(4*(Math.tan(Math.PI/6)));
        System.out.println("the area of hexagon is "+area);

    }
    
}
