
package sec3_random_point;

import java.util.Scanner;


public class Sec3_Random_point {

    
    public static void main(String[] args) {
         Scanner in = new Scanner (System.in);
        System.out.println("Enter the point x then Click (Enter) and input the y ");
        double width=(int)(Math.random()*51);
        double hight=(int)(Math.random()*100);
 
            System.out.println("the point ("+width+","+hight+")");
        
    }
    
}
