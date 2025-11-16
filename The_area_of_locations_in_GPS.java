
package the_area_of_locations_in_gps;

import java.util.Scanner;
public class The_area_of_locations_in_GPS {

   
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        double r=6371.0; //This is earth's radius 
        
        double X1,X2,X3,X4,Y1,Y2,Y3,Y4; // x is like latitude and y is like longtitude
        System.out.println("Enter the first city latitude");
        X1=Math.toRadians(input.nextDouble());
        System.out.println("Enter the first city longtitude");
        Y1= Math.toRadians(input.nextDouble());
         System.out.println("Enter the second city latitude");
        X2=Math.toRadians(input.nextDouble());
        System.out.println("Enter the second city longtitude");
        Y2= Math.toRadians(input.nextDouble());
         System.out.println("Enter the thirth city latitude");
        X3=Math.toRadians(input.nextDouble());
        System.out.println("Enter the thirth city longtitude");
        Y3= Math.toRadians(input.nextDouble());
         System.out.println("Enter the fourth city latitude");
        X4=Math.toRadians(input.nextDouble());
        System.out.println("Enter the fourth city longtitude");
        Y4= Math.toRadians(input.nextDouble());
        
        double AB = r * Math.acos(Math.sin(X1)*Math.sin(X2) + Math.cos(X1)*Math.cos(X2)*Math.cos(Y1 - Y2));
        double BC = r * Math.acos(Math.sin(X2)*Math.sin(X3) + Math.cos(X2)*Math.cos(X3)*Math.cos(Y2 - Y3));
        double AC = r* Math.acos(Math.sin(X1)*Math.sin(X3) + Math.cos(X1)*Math.cos(X3)*Math.cos(Y1 - Y3));
        double AD = r* Math.acos(Math.sin(X1)*Math.sin(X4) + Math.cos(X1)*Math.cos(X4)*Math.cos(Y1 - Y4));
        double CD = r* Math.acos(Math.sin(X3)*Math.sin(X4) + Math.cos(X3)*Math.cos(X4)*Math.cos(Y3 - Y4));
        
          double s1 = (AB + BC + AC) / 2;
        double area1 = Math.sqrt(s1 * (s1 - AB) * (s1 - BC) * (s1 - AC));
          double s2 = (AC + CD + AD) / 2;
          
        double area2 = Math.sqrt(s2 * (s2 - AC) * (s2 - CD) * (s2 - AD));
        double totalArea = area1 + area2;
        
        System.out.printf("The estimated area enclosed by the four cities is: %.2f km^2\n", totalArea);
        
        input.close();

    }
    
}
