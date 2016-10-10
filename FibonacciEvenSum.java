package fibonacciEven;

public class FibonacciEvenSum {

	public static void main(String[] args) {
		int fib1=1;
		int fib2=2;
		int sumEvenFib=1;
		int fibCurent;
		do
		{
			fibCurent= fib1+ fib2;
			fib1=fib2;
			fib2=fibCurent;
			if (fibCurent %2 ==0) 
				sumEvenFib+=fibCurent;
			
		} while (fibCurent< 4000000);
		System.out.println(sumEvenFib);

	}

}
