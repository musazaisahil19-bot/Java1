
package sec4_area_of_pentagun;

import java.util.Scanner;


public class Sec4_area_of_pentagun {

    
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the lenth from the center to a vertex");
        double r =in.nextDouble();
        double s =(2*(r))*(Math.sin(Math.PI/5));
        double area =(5*s*s)/(4*(Math.tan(Math.PI/5)));
        System.out.println("the area of pentagun is "+area);
        
    }
    
}
