
package sec4_.great_circle_distance;

import java.util.Scanner;


public class Sec4_Great_circle_distance {

    
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter point 1 (latitude and longitude) in degrees: ");
        double x1=in.nextDouble(); 
        double X1=Math.toRadians(x1);
        double y1=in.nextDouble();
        double Y1=Math.toRadians(y1);
        System.out.println("Enter point 2 (latitude and longitude) in degrees:");
        double x2=in.nextDouble();double X2=Math.toRadians(x2);
        double y2=in.nextDouble();double Y2=Math.toRadians(y2);
        
        double d= 6371.01 *  Math.acos(Math.sin(X1)*Math.sin(X2)+Math.cos(X1)*Math.cos(X2)*Math.cos(Y1-Y2));
        System.out.println("The distance between the two points is "+d+"Km");
  
    }
    
}
