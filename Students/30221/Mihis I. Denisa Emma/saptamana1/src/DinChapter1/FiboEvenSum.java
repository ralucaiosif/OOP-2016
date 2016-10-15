package prob1;
public class FiboEvenSum {
	public static void main(String [] args) {
	    int a; 
	    int b = 0;
	    int c = 1;
	    int sum = 0;

	    while (c<4000000){
	        a = b;//ase sa face siru lu fibo: newFib=prevFirst + prevSecond;
	        								//prevFirst = prevSecond;
	        								//prevSecond = newFib;
	        b = c;
	        c = a + b;
	    
	        if ( c % 2 == 0) { // vede daca ii par
	            sum += c;
	        }
	    }
	    System.out.println(sum);
	}

}
