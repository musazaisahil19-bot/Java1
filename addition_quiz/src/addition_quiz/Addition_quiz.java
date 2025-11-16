
package addition_quiz;

import java.util.Scanner;


public class Addition_quiz {

    
    public static void main(String[] args) {
       Scanner in =new Scanner(System.in);
    int v1=(int)(Math.random()*100);
    int v2=(int)(Math.random()*100);
    int correct=v1+v2;
        System.out.println("Enter the sum of this\n"+v1+"+"+v2+"=?");
    int user=in.nextInt();
    if (user ==correct){
        System.out.println("welldone");
    }else {
        System.out.println("incorrect Answer");
    }
    }
    
}
