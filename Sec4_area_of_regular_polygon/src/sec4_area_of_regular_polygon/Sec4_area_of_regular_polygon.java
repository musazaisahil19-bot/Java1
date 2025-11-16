
package sec4_area_of_regular_polygon;

import java.util.Scanner;


public class Sec4_area_of_regular_polygon {

    
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the number of side");
        double n =in.nextDouble();
        System.out.println("Enter the side");
        double s =in.nextDouble();
        double area =(n*s*s)/(4*(Math.tan(Math.PI/n)));
        System.out.println("the area of polygon is "+area);
    }
    
}
