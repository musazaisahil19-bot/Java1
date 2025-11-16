
package random_point_on_a_circle4.pkg6;

import java.util.Random;

public class Random_point_on_a_circle46 {

    public static void main(String[] args) {
       final double r=40;
       
       Random rand=new Random();
       
       double angle1=rand.nextDouble()*2*Math.PI;
       double angle2=rand.nextDouble()*2*Math.PI;
       double angle3=rand.nextDouble()*2*Math.PI;// generating three random angles between 0 to 2pi
       
       double x1=r*Math.cos(angle1);// computing x and y for each point
       double y1=r*Math.sin(angle1);
       double x2=r*Math.cos(angle2);
       double y2=r*Math.sin(angle2);
       double x3=r*Math.cos(angle3);
       double y3=r*Math.sin(angle3);
       
       double s1=Math.sqrt(Math.pow(x2-x3, 2)+Math.pow(y2-y3, 2));
       double s2=Math.sqrt(Math.pow(x1-x3, 2)+Math.pow(y1-y3, 2));
       double s3=Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2));
       
       
       double angleA=Math.acos((s1*s1-s2*s2-s3*s3)/(-2*s2*s3));// on this part we used the law of cosine  to find out the angles of triangle
       double angleB=Math.acos((s2*s2-s1*s1-s3*s3)/(-2*s1*s3));
       double angleC=Math.acos((s3*s3-s2*s2-s1*s1)/(-2*s2*s1));
       
       angleA=Math.toDegrees(angleA);
       angleB=Math.toDegrees(angleB);
       angleC=Math.toDegrees(angleC);
       
        System.out.println("The three points are: ");
        System.out.printf("(%.2f, %.2f)%n",x1,y1);
        System.out.printf("(%.2f, %.2f)%n",x2,y2);
        System.out.printf("(%.2f, %.2f)%n",x3,y3);
        
        System.out.println("\nThe angles of the triangle are: ");
        System.out.printf(":Angle A: %.2f degrees%n",angleA);
        System.out.printf(":Angle B: %.2f degrees%n",angleB);
        System.out.printf(":Angle C: %.2f degrees%n",angleB);
        
        System.out.printf("Sum of the angles: %.2f degrees%n",(angleA+angleB+angleC));
        
        
       
       
    }
    
}
