
package divasable_by5and6;


public class divasable_by5and6 {
     //book problem
    
    public static void main(String[] args) {
        
        System.out.println("these are the numbers in interval (100-1000) which are divised by 5 and 6");
        System.out.println("there are 10 numbers per line separated by one space");
        int i ;
        int c =0;
        for (i =100; i<=1000;i++){
          if (i%5 == 0 && i%6 ==0){
                System.out.print(i+" ");
        c++;
        if (c % 10 == 0){
            System.out.println("");
        }
    }
}}    
    
}
