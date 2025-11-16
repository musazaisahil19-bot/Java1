
package sec5_head_or_tails;


public class Sec5_head_or_tails {

    
    public static void main(String[] args) {
        int head =0;
           int tails =0;
        for (int i=1; i<=1000000; ){
           int rand =(int)(Math.random()*2);
          
            if (rand ==0){
                System.out.println("Head");
                head++;
            }else{
                System.out.println("Tails");
                tails++;
            } 
            i++;
            
        }
        System.out.println("heads are "+head+ "tails are "+ tails);
    }
    
}
