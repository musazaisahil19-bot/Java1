
package predicting_the.future_tuition;


public class Predicting_theFuture_Tuition {

    
    public static void main(String[] args) {
        System.out.println("tuition for univercity is 10000$\n"
                + "it will increse 7% inevery year");
        System.out.println("in how many years will the tuition be doubled?");
     double tuition =10000;
     double tuition_doubled =20000;
     int year=0;
     while (tuition<=tuition_doubled){
         tuition =tuition*1.07;
     year++;}
        System.out.println("Answer after "+year+"your tuition will be "+tuition);
    }
    
}
