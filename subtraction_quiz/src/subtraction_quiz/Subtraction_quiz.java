
package subtraction_quiz;

import java.util.Scanner;

public class Subtraction_quiz {

  
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
    int v1=(int)(Math.random()*100);
    int v2=(int)(Math.random()*100);
    if (v1>=v2){
        int correct =v1-v2;
         System.out.println("Enter the subtraction of this\n"+v1+"-"+v2+"=?");
         int user=in.nextInt();
         if (user==correct){
             System.out.println("welldone");
         }else{
             System.out.println("incorrect");
         }
    }else {
         System.out.println("Enter the subtraction of this\n"+v2+"-"+v1+"=?");
         int correct=v2-v1;
         int user =in.nextInt();
         if (user==correct){
             System.out.println("welldone");
         }else{
             System.out.println("incorrect");
    }
    
    }
    
   }
}
 