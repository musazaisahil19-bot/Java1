
package days_of_a_month4.pkg17;

import java.util.Scanner;

public class Days_of_a_month417 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter a year: ");
        int year=input.nextInt();
        
        System.out.println("Enter a month: ");
        String month=input.next();
        
        int days=0;
        boolean validmonth=true;
        
        switch(month){
            case "jan": case "Mar": case "May" : case "jul": case "Aug": case "oct": case "dec":
                days=31;
                break;
            case "Apr": case "jun": case "sep": case "Nov":
                days=30;
                break;
            case "feb":
                if((year %4==0 && year%100 !=0)||(year%400==0)){
                    days=29;}
                else {
                    days=28;
                }
                break;
            default:
                validmonth=false;
                System.out.println("Invalid month input");
                break;}
        
                if (validmonth){
                    System.out.println("month"+""+year+"has"+days+"days");
                }
                
                    
                
        
    }
    
}
