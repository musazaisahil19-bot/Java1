
package cheak_isbn;

import java.util.Scanner;


public class Cheak_ISBN {

    
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the 9 diget of ");
        int diget=in.nextInt();
        int d1=(int)diget/100000000;
        int d2=(int)((diget/10000000)%10);
        int d3=(int)((diget/1000000)%10);
        int d4=(int)((diget/100000)%10);
        int d5=(int)((diget/10000)%10);
        int d6=(int)((diget/1000)%10);
        int d7=(int)((diget/100)%10);
        int d8=(int)((diget/10)%10);
        int d9=diget%10;
        int d10=(d1*1+d2*2+d3*3+d4*4+d5*5+d6*6+d7*7+d8*8+d9*9)%11;
        if (d10==10){
            System.out.println(d1+""+d2+""+d3+""+d4+""+d5+""+d6+""+d7+""+d8+""+d9+"X");
        }else{
             System.out.println(d1+""+d2+""+d3+""+d4+""+d5+""+d6+""+d7+""+d8+""+d9+""+d10);
        }
   
    }
    
    
}
