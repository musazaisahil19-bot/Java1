
package cost_of_driving;

import java.util.Scanner;


public class Cost_of_driving {

    
    public static void main(String[] args) {
       Scanner in =new Scanner(System.in);
        System.out.println("enter the driving distance in kilometer");
        double dis = in.nextDouble();
        System.out.println("enter the efficiency of fuel per kilometer ");
        double effi_fuel=in.nextDouble();
        System.out.println("enter the price of fuel in afghanis");
        double fuel = in.nextDouble();
        double cost=dis*effi_fuel*fuel;
        System.out.println("it cost's="+cost+"afghanis");
    }
    
}
