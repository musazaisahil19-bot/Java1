
package current_time;

import java.util.Scanner;

public class Current_TIme {
    
    public static void main(String[] args) {
        Scanner inpout = new Scanner(System.in);
      long total_milli_seconds = System.currentTimeMillis();
      long total_seconds = total_milli_seconds/1000;
      long current_seconds = total_seconds%60;
      long total_minute = total_seconds/60;
      long current_minute = total_minute%60;
      long total_hour = total_minute/60;
      long current_hour = total_hour%24;
        System.out.println("time"+total_milli_seconds);  
        System.out.println("seconds"+total_seconds);
        System.out.println("current seconds"+current_seconds);
        System.out.println("total minute"+total_minute);
        System.out.println("current minute"+current_minute); 
        System.out.println("total hour"+total_hour);
        System.out.println("currenthour"+current_hour);
        System.out.println("Enther the GMT Hour");  
     int h = inpout.nextInt();
        System.out.println("Enter the GMT Minute");
     int m = inpout.nextInt();
       
      if ((current_minute+(m))>=60)
    {System.out.println((current_hour+(h)+(1))+":"+(current_minute%30)+":"+current_seconds);}
     else if (current_hour+(h)>0 & current_minute +(m) < 60)
              {System.out.println(current_hour+h+":"+(current_minute+(m))+":"+current_seconds);}
     if  (current_hour+(h)<=0)
      {System.out.println((current_hour+(h)+(12))+":"+(current_minute+(m))+":"+current_seconds);
              }
     if (h == 4 & m==30 )
        
     {System.out.println("kabul city");}   
       if (h == 4 &m==0 ){System.out.println("Abo dhabi and Dubai");}
       
     if (h==3 & m==30){System.out.println("Tehran"); }
     
       if (h ==5 & m==30 ){System.out.println("Dehli and Mumbai");}
       if (h ==5 & m ==0 ) {System.out.println("Islamabad and Tashkent ");}
    }
    
}
