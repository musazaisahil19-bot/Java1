
package latry;

import java.util.Scanner;


public class Latry {

        public static void main(String[] args) {
        Scanner inpout = new Scanner(System.in);
          int A = (int) (Math.random()*100);
          int B = (int) (Math.random()*100);
            System.out.println(A&B);
          int resalt = inpout.nextInt();
          if (A + B == resalt)
          {System.out.println("hi");}
    }
    
}
