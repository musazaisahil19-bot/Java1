
package random_character4.pkg16;

public class Random_character416 {

    public static void main(String[] args) {
        int randomnum=(int)(Math.random()*26); // generate a random number between 0 to 25
        
        char randomchar=(char)('A'+randomnum);
        
        System.out.println("Random uppercase letter "+randomchar);
    }
    
}
