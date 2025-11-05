
package gessing_birthday;

import java.util.Scanner;


public class Gessing_birthday {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        String s1=("1 3 5 7 9 \n"
                + "11 13 15 17 19 \n"
                + "21 23 25 27 29 31");
        String s2=("2 3 6 7 \n"
                + "10 11 14 15 \n"
                + "18 19 22 23 \n"
                + "28 29 30 31");
        String s3=("4 5 6 7 \n"
                + "12 13 14 15 \n"
                + "20 21 22 23 \n"
                + "28 29 30 31");
        String s4=("8 9 10 11 \n"
                + "12 13 14 15 \n"
                + "24 25 26 27 \n"
                + "28 29 30 31");
        String s5=("16 17 18 19 \n"
                + "20 21 22 23 \n"
                + "24 25 26 27 \n"
                + "28 29 30 31");
        int d =0;
        System.out.println("is yor birthday in this set\n"+s1+
                "\nif yes write 1 if not write 2");
        int As1=in.nextInt();
        if (As1==1){
            d +=1;
        }
         System.out.println("is yor birthday in this set\n"+s2+
                "\nif yes write 1 if not write 2");
        int As2=in.nextInt();
        if (As2 ==1)
            d +=2; 
         System.out.println("is yor birthday in this set\n"+s3+
                "\nif yes write 1 if not write 2");
        int As3=in.nextInt();
         if (As3 ==1)
            d +=4; 
         System.out.println("is yor birthday in this set\n"+s4+
                "\nif yes write 1 if not write 2");
        int As4=in.nextInt();
         if (As4 ==1)
            d +=8; 
         System.out.println("is yor birthday in this set\n"+s5+
                "\nif yes write 1 if not write 2");
        int As5=in.nextInt();
         if (As5 ==1)
            d +=16; 
         System.out.println(d);
        
      
            
        
    }
    
}
