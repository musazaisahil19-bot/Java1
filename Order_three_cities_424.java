
package order_three_cities_4.pkg24;

import java.util.Scanner;

public class Order_three_cities_424 {

    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       
        System.out.println("Enter the first city: ");
        String city1=input.nextLine();
        
        System.out.println("Enter the second city: ");
        String city2=input.nextLine();
        
        System.out.println("Enter the third city: ");
        String city3=input.nextLine();
        
        if(city2.compareTo(city1)<0){
            String temp=city1;
            city1= city2;
            city2= temp;
        }
        if(city3.compareTo(city2)<0){
            String temp=city2;
            city2= city3;
            city3= temp;
        }
        if(city1.compareTo(city3)<0){
            String temp=city1;
            city1= city3;
            city3= temp;
        }
        System.out.println("The three cities order based on alphabetical are : "+city3+" "+city2+" "+city1);
        
        
    }
    
}
