
package swap.two.numbers.without.pkg3rd.variable;

import java.util.Scanner;

public class SwapTwoNumbersWithout3rdVariable {


  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the first number (a):");
        int a = input.nextInt();
       
        System.out.print("Enter the second number(b):");
        int b = input.nextInt();
        
        a = a + b;
        b = a - b;
        a = a - b;
        
        System.out.println("After Swapping:");
        System.out.println("First number(a):"+ a);
        System.out.println("Second number(b)"+ b);
        
        
        
    }
    
}
