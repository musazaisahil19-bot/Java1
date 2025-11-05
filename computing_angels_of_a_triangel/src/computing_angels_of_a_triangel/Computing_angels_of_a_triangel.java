
package computing_angels_of_a_triangel;

import java.util.Scanner;
public class Computing_angels_of_a_triangel {

   
    public static void main(String[] args) {
       Scanner in =new Scanner(System.in);
        System.out.println("enter the value for x1,y1");
        double x1=in.nextDouble();
        double y1=in.nextDouble();
        System.out.println("enter the value for x2,y2");
        double x2=in.nextDouble();
        double y2=in.nextDouble();
        System.out.println("enter the value for x3,y3");
        double x3=in.nextDouble();
        double y3=in.nextDouble();
          double c=Math.sqrt(Math.pow(x1-x2,2 )+ Math.pow(y2-y1, 2));
           double a=Math.sqrt(Math.pow(x3-x2,2 )+ Math.pow(y3-y2, 2));
            double b=Math.sqrt(Math.pow(x3-x1,2 )+ Math.pow(y3-y1, 2));
           double A =Math.toDegrees(Math.acos((b*b+c*c-a*a)/(2*b*c)));
            double B =Math.toDegrees(Math.acos((a*a+c*c-b*b)/(2*a*c)));
             double C =Math.toDegrees(Math.acos((a*a+b*b-c*c)/(2*b*a)));
             System.out.println("A="+A+"\nB="+B+"\nC="+C);
             
             
             
    }
    
}
