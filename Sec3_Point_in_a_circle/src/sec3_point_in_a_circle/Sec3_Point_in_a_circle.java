
package sec3_point_in_a_circle;

import java.util.Scanner;


public class Sec3_Point_in_a_circle {

    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter a point with two coordinates without space in integer type");
        int input =in.nextInt();
        int x=(int)input/10;
        int y=input%10;
        double distance=Math.sqrt((x*x)+(y*y));
        if (distance <=10){
            System.out.println("the point ("+x+","+y+") is in the circle");
        }else {
             System.out.println("the point ("+x+","+y+") is not in the circle");
        }
    }
    
}
