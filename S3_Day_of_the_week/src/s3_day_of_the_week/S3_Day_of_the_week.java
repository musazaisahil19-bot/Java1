
package s3_day_of_the_week;

import java.util.Scanner;


public class S3_Day_of_the_week {

   
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
        System.out.println("Enter the year");
     int year =in.nextInt();
      System.out.println("Enter the Mount");
     int m =in.nextInt();
     if (m==1){
         m=13;
         year =year-1;
     }
     if (m==2){
         m=14;
         year =year-1;
     }
     int k =year %100;
     int j =year/100;
      
        System.out.println("Enter the days of the Mount");
     int q=in.nextInt();
     int h =(q +(26*(m+1)/10)+k+(k/4)+(j/4)+(5*j))%7;
        switch (h){
           case 0:System.out.println("Saturday");break ;
            case 1:System.out.println("Sunday");break ;
             case 2:System.out.println("Monday");break ;
              case 3:System.out.println("Thusday");break ;
               case 4:System.out.println("Wendsday");break ;
                case 5:System.out.println("Thersday");break ;
                 case 6:System.out.println("Friday");break ;
    
        }
        
        
    }
}
