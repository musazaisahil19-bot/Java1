
package advance_math;

import java.util.Scanner;


public class Advance_math {

    
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
      int count =0;
      int correct = 0;
      int incorrect = 0;
      while (count<5){
          int rand=(int)(Math.random()*1000);
          int A =rand/10;
          int B =rand%100;
          System.out.println("what is the answer\n"
                  + A+"+"+B+"="+"?");
          int user =in.nextInt();
          if (user == A+B){
              System.out.println("your answer is correct"); correct++;
          }
          else{
          System.out.println("your answer is incorrect ");
              System.out.println("the correct answer is "+(A+B));incorrect++;
          }
      count++;
      }
        System.out.println("thank you");
        System.out.println("your correct answer's are "+correct);
         System.out.println("your incorrect answer's are "+incorrect);
    }
    
}
