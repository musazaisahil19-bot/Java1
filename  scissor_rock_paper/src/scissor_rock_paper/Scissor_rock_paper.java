
package scissor_rock_paper;

import java.util.Scanner;


public class Scissor_rock_paper {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int rand =(int)(Math.random()*3);
      
        int Scissor =0;
        int rock=1;
        int paper=2;
        System.out.println("Enter one of these Scissor(0) Rock(1) paper(2)");
        int user=input.nextInt();
        if (user==rand){
            switch(rand){
                case 0:System.out.println("the computer is Sciccer you are Scisser draw  ");
               case 1:System.out.println("the computer is Rock you are Rock draw  ");
               case 2:System.out.println("the computer is Paper you are Paper draw  ");
            }
        }else if (rand ==1&&user==0){
            System.out.println("the computer is Rock you are Scisser you lose");
        }else if (rand ==1&&user==2){
            System.out.println("the computer is Rock you are Paper you won");
        }else if (rand ==0&&user==1){
            System.out.println("the computer is Scisser you are Rock you won");
        }else if (rand ==0&&user==2){
            System.out.println("the computer is Scisser you are Paper you lose ");
        }else if (rand ==2&&user==0){
            System.out.println("the computer is Paper you are Scisser you won");
        }else if (rand ==2&&user==1){
            System.out.println("the computer is Paper you are Rock you lose");
        }else{
            System.out.println("invoild selection");
        }
    }
    
}
