
package taxes;

import java.util.Scanner;


public class Taxes {

   
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
        System.out.println("please select your marital status\n"
                + "1 for single\n"
                + "2 for married filing jointly\n"
                + "3 for married filing separately\n"
                + "4 for head of household");
        int status = in.nextByte();
        if (status == 1){System.out.println("enther your income");
           double money = in.nextDouble();
             if (money <= 8350)
             { double tax =(money *10)/100;
                 System.out.println("your tax amount is" +tax);
             }
             if (money > 8350 && money<= 33950)
             { double tax =( money *15)/100;
               System.out.println("your tax amount is" +tax);}
                 if (money > 33950 && money<=82250 )
             { double tax =( money *25)/100;
               System.out.println("your tax amount is" +tax);}
                  if (money > 82250 && money<= 171550)
             { double tax =( money *28)/100;
               System.out.println("your tax amount is" +tax);} 
                 if (money > 171550 && money<=372950 )
             { double tax =( money *33)/100;
               System.out.println("your tax amount is" +tax);}  
                 if (money > 372950)
             { double tax =( money *35)/100;
               System.out.println("your tax amount is" +tax);}  
                 }
         if (status == 2){System.out.println("enther your income");
           double money = in.nextDouble();
             if (money <= 16700)
             { double tax =(money *10)/100;
                 System.out.println("your tax amount is" +tax);
             }
             if (money > 16700 && money<= 67900)
             { double tax =( money *15)/100;
               System.out.println("your tax amount is" +tax);}
                 if (money > 67900 && money<=137050 )
             { double tax =( money *25)/100;
               System.out.println("your tax amount is" +tax);}
                  if (money > 137050 && money<= 208850)
             { double tax =( money *28)/100;
               System.out.println("your tax amount is" +tax);} 
                 if (money > 208850 && money<=372950 )
             { double tax =( money *33)/100;
               System.out.println("your tax amount is" +tax);}  
                 if (money > 372950)
             { double tax =( money *35)/100;
               System.out.println("your tax amount is" +tax);}  
                 }
          if (status == 3){System.out.println("enther your income");
           double money = in.nextDouble();
             if (money <= 8350)
             { double tax =(money *10)/100;
                 System.out.println("your tax amount is" +tax);
             }
             if (money > 8350 && money<= 33950)
             { double tax =( money *15)/100;
               System.out.println("your tax amount is" +tax);}
                 if (money > 33950 && money<=68525 )
             { double tax =( money *25)/100;
               System.out.println("your tax amount is" +tax);}
                  if (money > 68525 && money<= 104425)
             { double tax =( money *28)/100;
               System.out.println("your tax amount is" +tax);} 
                 if (money > 104425 && money<=186475 )
             { double tax =( money *33)/100;
               System.out.println("your tax amount is" +tax);}  
                 if (money > 186475)
             { double tax =( money *35)/100;
               System.out.println("your tax amount is" +tax);}  
                 }
           if (status == 4){System.out.println("enther your income");
           double money = in.nextDouble();
             if (money <= 11950)
             { double tax =(money *10)/100;
                 System.out.println("your tax amount is" +tax);
             }
             if (money > 11950 && money<= 45500)
             { double tax =( money *15)/100;
               System.out.println("your tax amount is" +tax);}
                 if (money > 45500 && money<=117450 )
             { double tax =( money *25)/100;
               System.out.println("your tax amount is" +tax);}
                  if (money > 117450 && money<= 190200)
             { double tax =( money *28)/100;
               System.out.println("your tax amount is" +tax);} 
                 if (money > 190200 && money<=372950 )
             { double tax =( money *33)/100;
               System.out.println("your tax amount is" +tax);}  
                 if (money > 372950)
             { double tax =( money *35)/100;
               System.out.println("your tax amount is" +tax);}  
                  }
           else System.out.println("you selected unvoild option");
                    
    }
    
}
