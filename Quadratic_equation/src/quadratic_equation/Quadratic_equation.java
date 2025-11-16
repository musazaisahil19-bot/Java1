
package quadratic_equation;

import java.util.Scanner;


public class Quadratic_equation {

    
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        System.out.println("write a value for a ");
        double A = in.nextDouble();
        System.out.println("now write for b ");
        double B = in.nextDouble();
        System.out.println("write value for c");
        double C =in.nextDouble();
        double dalta = (B*B)-4*A*C;
        if (dalta>0 && A != 0){
        System.out.println("it has two real roots");
        double X1 = (-B +Math.sqrt(dalta))/2*A;
        double X2 = (-B -Math.sqrt(dalta))/2*A;
        System.out.println("x1= "+X1+"\nx2= "+X2);}
        else if (dalta==0){
            System.out.println("it has one real root");
        double X = (-B +Math.sqrt(dalta))/2*A;
        System.out.println("X= "+X);}
        if (A==0)System.out.println("it is not a qudratic equation");
        else { System.out.println("don't have solvtion");}
    }
    
}
