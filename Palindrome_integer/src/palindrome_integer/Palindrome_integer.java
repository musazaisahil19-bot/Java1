
package palindrome_integer;

import java.util.Scanner;


public class Palindrome_integer {

   
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter three diget number");
        int user=in.nextInt();
        int diget1=(int)user/100;
        int diget2=((int)(user/10))%10;
        int diget3=user%10;
        if (diget1==diget3){
            System.out.println(user+" is palindrom");
        }else{
            System.out.println(user+" is not palindrom");
        }
    }
    
}
