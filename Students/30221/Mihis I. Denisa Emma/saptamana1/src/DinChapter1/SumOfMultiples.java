package prob1;
import java.util.ArrayList;


public class SumOfMultiples {

    public static void main(String[] args) {

        ArrayList<Integer> x = new ArrayList<Integer>();
        ArrayList<Integer> y = new ArrayList<Integer>();
        int multiplii3 = 0;
        int multiplii5 = 0;

        int total =0;


        for(int i =0; i < 1000 ; i++){
            if(i % 3 == 0){
                x.add(i);
                multiplii3+= i;
            }
            else if(i % 5 == 0 ){
                y.add(i);
                multiplii5 +=i;
            }
        }
        
        total = multiplii3 + multiplii5;



        System.out.println("The sum of all the multiples of 3 or 5 below 1000 is: " +total);

    }

}
