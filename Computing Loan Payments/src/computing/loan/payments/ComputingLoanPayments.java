
package computing.loan.payments;

import java.util.Scanner;

public class ComputingLoanPayments {

   
    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        System.out.println("Enter loan amount ");
        double l = in.nextDouble();
        System.out.println("Enter monthly interest rate ");
        double m = in.nextDouble();
        System.out.println("Enter number of year ");
        double y = in.nextDouble();
        double x = 1+m;
        double u = y*12;
        double p =(l * m)/ 1-(1.0/Math.pow(x, u));
        System.out.println("Your monthly payment is "+p);
    }
    
}
