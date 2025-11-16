package multipa.table;
public class MultipaTable {
    public static void main(String[] args) {
       
        System.out.println("       Multiplication Table ");
        System.out.print("    ");
        for(int x = 1; x <=10;x++){
            System.out.print("    "+x);
            
        }System.out.println("\n- - - - - - - - - - - - - - - - - - - - - - - -");
       for(int y = 1 ; y<=10 ; y++){
                System.out.println(y +" |");
               for(int x = 1; x <=10;x++){
                   System.out.printf(" %4d",x*y);
               }
                System.out.println( );
                
            }
    }
    
}
