
package phone_number;

import java.util.Scanner;


public class Phone_number {

    
    public static void main(String[] args) {
        System.out.println("enter your number");
        Scanner in = new Scanner(System.in);
        long x =in.nextLong();
        if (x < 700000000 || x >799999999 ){
            System.out.println("unvolid number"); }
      int p = (int)x/10000000;
        switch (p) {
            case 78:
            case 73:
                System.out.println("it is an ETISALAT number");
                break;
            case 70:
                System.out.println("it is an AFGAN WIERLESS number");
                break;
            case 76:
            case 77:
                System.out.println("it is an ATOMA(MTN)number");
                break;
            case 72:
            case 79:
                System.out.println("it is an ROSHAN number");
                break;
            case 74:
                System.out.println("it is an SALAM number");
                break;
            case 71:
            case 75:
                System.out.println("up to now we dont have a number like this ");
                break;
            default:
                break;
        }
    }
    
}
