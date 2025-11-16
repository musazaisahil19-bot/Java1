
package corner_point_coordinates4.pkg7;

import java.util.Scanner;

public class Corner_point_coordinates47 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter the radius of the bounding circle: ");
        double r=input.nextDouble();
        
        System.out.println("The coordinates of five points on the pentagone are: ");
        
        double anglestep=2*Math.PI/5;
        for(int i=0;i<5;i++){
            double angle=i*anglestep;
            
            double x=r*Math.cos(angle);
            double y=r*Math.sin(angle);
            
            System.out.printf("(%.2f, %.2f)%n",x,y);}
            
        
        
        }
        
    }
    

