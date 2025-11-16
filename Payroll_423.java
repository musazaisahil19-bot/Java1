
package payroll_4.pkg23;

import java.util.Scanner;

public class Payroll_423 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter employe's name: ");
        String name=input.nextLine();
        
        System.out.println("Enter number of hours worked: ");
        double hour=input.nextDouble();
        
        System.out.println("Enter hourly pay rate: ");
        double rate=input.nextDouble();
        
        System.out.println("Enter federal tax withholding rate: ");
        double federalrate=input.nextDouble();
        
        System.out.println("Enter state tax withholding tax: ");
        double staterate=input.nextDouble();
        
        double grosspay= hour*rate;
        double federalwithholding=grosspay*federalrate;
        double statewithholding=grosspay*staterate;
        double totaldeduction=federalwithholding+statewithholding;
        double netpay=grosspay-totaldeduction;
        
        System.out.println("\nEmployee Name: "+name);
        System.out.println("Hours worked: "+hour);
        System.out.println("Pay rate: $"+rate);
        System.out.println("Groos pay: $"+ String.format("%.2f",grosspay));
        System.out.println("        Deductions: ");
        System.out.println("Federal with holding ( "+(federalrate*100)+"% ): $"+String.format("%.2f", federalwithholding));
        System.out.println("State withholding ( "+(staterate*100)+"%): $"+String.format("%.2f", statewithholding));
        System.out.println("Total deduction: $"+ String.format("%.2f", totaldeduction));
        System.out.println("Net pay: $"+ String.format("%.2f", netpay));
    }
    
}
