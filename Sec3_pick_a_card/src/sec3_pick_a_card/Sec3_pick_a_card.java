
package sec3_pick_a_card;


public class Sec3_pick_a_card {

    
    public static void main(String[] args) {
        
        int card_number=(int)(Math.random()*52);
        String[] ranks={
            "Ace","2","3","4","5","6","7","8","9","10","jack","queen","king"
        };
        String[] suits={
            "clubs","dimonds","hearts","spades"
        };
        String rank =ranks[card_number % 13];
        String suit =suits[card_number / 13];
        System.out.println("The card you picked is : "+rank+" of "+suit);
        
    }
    
}
