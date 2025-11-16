
package find_the_number_of_year;

import java.util.Scanner;


public class Find_the_number_of_year {

    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of minute ");
        int minute =in.nextInt();
        int year =minute/525600;
        int day =(minute%525600)/1440;
        System.out.println(minute+" minutes is aproximately "+year+" years and "+day+" days");
    }
    
}
