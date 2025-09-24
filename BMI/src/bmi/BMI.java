
package bmi;

import java.util.Scanner;


public class BMI {

   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enther your weight");
        double weight = in.nextDouble();
        System.out.println("Enther your height");
        double hight = in.nextDouble();
        double bmi = weight/(hight*hight);
        System.out.println(bmi);
        if (bmi<18.5)
        {  System.out.println("you are under weight");}
        if (18.5 <= bmi && bmi < 25)
        { System.out.println("you are normal");}
        if (25 <= bmi && bmi <30)
        { System.out.println("you are over weight");}
        if (bmi>= 30)
            System.out.println("you are obese");
            
    }
    
}
