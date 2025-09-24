
package perimeter_of_rectangle;
import java.util.Scanner;
    



public class Perimeter_of_rectangle {
    
  
    public static void main(String[] args) {
     Scanner aa = new Scanner (System.in); 
        System.out.println("enter lenth");
      
      double lenth = aa.nextInt();
       System.out.println("enter width");
        double width = aa.nextInt();
      
       double perimeter = lenth * width;
        System.out.println("the lenth is" + lenth);
        System.out.println("the width is" + width);
        System.out.println("so the Perimeter Of Rectangle is" + perimeter);
    }
    
}
