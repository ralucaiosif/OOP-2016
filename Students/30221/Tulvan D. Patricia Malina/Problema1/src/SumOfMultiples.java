import java.util.Scanner;

public class SumOfMultiples {

	public static void main(String[] args) {
		int sumM=0,sum=0;
		int i;
		for(i=3;i<1000;i++)
			if(i%3==0 || i%5==0)
				sumM+=i;
		System.out.println("The sum of all multiples of 3 or 5 below 1000 is: " +sumM);
		System.out.println("Insert the limit:");
		Scanner in = new Scanner(System.in);
		int limit= in.nextInt();
		for(i=3;i<=limit;i++)
			if(i%3==0 || i%5==0)
				sum+=i;
		System.out.println("The sum of all multiples of 3 or 5 below the limit is: " +sum);
	}

}
