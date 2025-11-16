
package headsortails;

import java.util.Scanner;


public class HeadsOrTails {

   
    public static void main(String[] args) {
      Scanner in =new Scanner(System.in);  
       int rand=1+(int)((Math.random()*2));
        System.out.println("Enter 1 for head and 2 for tail");
        int user =in.nextInt();
//        if (user ==rand){
//            System.out.println("you win");
//        }else{
//            System.out.println("you loss");
//        }
        switch(user){
            case 1:System.out.println("you selcted head");
            if (rand==user){
           System.out.println("you win it is head");
       }else{
           System.out.println("but you loss it is tail");
       }System.out.println(rand);break;
            case 2:System.out.println("you selcted tail");
            if (rand==user){
           System.out.println("you win it is tail");
       }else{
           System.out.println("but you loss it is head");
       }
        }
       
    
    }
}
