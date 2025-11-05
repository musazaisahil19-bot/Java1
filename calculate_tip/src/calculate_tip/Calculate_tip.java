
package calculate_tip;

import java.util.Scanner;


public class Calculate_tip {

    
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enter the subtotal rate");
        double sub = in.nextDouble();
        System.out.println("enter the gratuity rate");
        double gratuity_rate=in.nextDouble();
        double gratuity = sub*gratuity_rate/100;
        double total =sub + gratuity;
        System.out.println("the gratuity is "+gratuity
        +"\nthe total is "+total);
    }
    
}
