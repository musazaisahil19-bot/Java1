
package lottery;

import java.util.Scanner;


public class Lottery {

   
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int lottery =(int)(Math.random()*100);
        System.out.println("Enter a two digites number to win prize");
        int guess = input.nextInt();
        System.out.println("the lottery number is"+lottery);
        int lottery_d1 = lottery /10;
        int lottery_d2 =lottery %10;
        int guess_d1 = guess /10;
        int guess_d2 = guess %10;
        if (lottery == guess)
            System.out.println("welldone you win 1000");
        else if (lottery_d1 == guess_d2 && lottery_d2 == guess_d1)
            System.out.println("you win 300");
        else if (lottery_d1 == guess_d1||
                lottery_d1 == guess_d2||
                lottery_d2 == guess_d1||
                lottery_d2 == guess_d2
                )System.out.println("you win 100");
                        else System.out.println("try again");
        
    }
    
}
