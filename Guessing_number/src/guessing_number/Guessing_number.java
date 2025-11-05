
package guessing_number;

import java.util.Scanner;


public class Guessing_number {

   
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
       int rand=0+(int) (Math.random()*101);
        System.out.println("enter a number (0-100)");
        int user=in.nextInt();
        while (rand != user){
        if (user<rand)
            System.out.println("too low");
        if (user>rand)
            System.out.println("too high");
        user=in.nextInt();
        }
         if (user==rand)
            System.out.println("welldone it is "+rand);
    }
    
}
