
package sort_three_integers;

import java.util.Scanner;


public class Sort_three_integers {

    
    public static void main(String[] args) {
      Scanner in =new Scanner(System.in);  
        System.out.println("Enter the first integer");
        int v1=in.nextInt();
        System.out.println("Enter the second integer");
        int v2=in.nextInt();
        System.out.println("Enter the thired integer");
        int v3=in.nextInt();
        if (v1>v2 &&v2> v3){
            System.out.println(v1+","+v2+","+v3);
        }else if(v1>v2&&v3>v2&v1>v3){
            System.out.println(v1+","+v3+","+v2);
        }else if(v2>v1&&v2>v3&&v3>v1){
            System.out.println(v2+","+v3+","+v1);
        }else if(v2>v1&&v1>v3){
            System.out.println(v2+","+v1+","+v3);
        }else if(v3>v1&&v1>v2){
            System.out.println(v3+","+v1+","+v2);
        }else if(v3>v1&&v2>v1&&v3>v1){
            System.out.println(v3+","+v2+","+v1);
        }
    }
    
}
