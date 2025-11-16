
package repeat_addition;

import java.util.Scanner;


public class Repeat_addition {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int num1=(int) (Math.random()*10) ;
       int num2=(int) (Math.random()*10) ;
        System.out.println("what is the answer\n"+num1+"+"+num2+"="+"?");
         int a=num1 + num2 ;
        int r =in.nextInt();
        while (r!=a){
            System.out.println("your answer is incorrect try again");
            System.out.println("what is the answer\n"+num1+"+"+num2+"="+"?");
            r =in.nextInt();
  }
        System.out.println("your answer is correct");
          
    }
    
}
