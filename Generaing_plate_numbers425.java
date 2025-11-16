
package generaing_plate_numbers4.pkg25;

import java.util.Random;

public class Generaing_plate_numbers425 {

    public static void main(String[] args) {
       Random rand=new Random();
       
       char letter1=(char)('A'+rand.nextInt(26));// creating three uppercase letters
       char letter2=(char)('A'+rand.nextInt(26));
       char letter3=(char)('A'+rand.nextInt(26));
       
       int digit1=rand.nextInt(10);
       int digit2=rand.nextInt(10);
       int digit3=rand.nextInt(10);
       int digit4=rand.nextInt(10);
       
       String platenumber=""+letter1+letter2+letter3+digit1+digit2+digit3+digit4;
        System.out.println("Generated plate number: "+platenumber);
    }
    
}
