
package sec3_liner_equation;

import java.util.Scanner;


public class Sec3_liner_equation {

    
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the a,b,c,d,e and f");
        double a=in.nextInt();
        double b=in.nextInt();
        double c=in.nextInt();
        double d=in.nextInt();
        double e=in.nextInt();
        double f=in.nextInt();
        double x=((e*d)-(b*f))/((a*d)-(b*c));
        double y=((a*f)-(e*c))/((a*d)-(b*c));

        if ((a*d-b*c)==0){
            System.out.println("the equation has no solution");
        }
        else{
            System.out.println("X is "+x+" and Y is "+y);
        }
    }
    
}
