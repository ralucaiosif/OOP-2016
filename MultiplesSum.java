package multiplesSum;
import java.util.Scanner;


public class MultiplesSum {

	public static void main(String[] args) {
		System.out.println("Enter a number to be the range\n");
		Scanner input= new Scanner (System.in);
		int range = input.nextInt();
		input.close();
		int sum=0;
		for (int i=1; i< range; i++)
		{
			if (checkMultiple(i)==true) 
			{
				sum+=i;
			}
		}
		System.out.println(sum);

	}
	
	public static boolean checkMultiple(int number){
		if ((number % 3==0) || (number % 5==0))
			return true;
		else return false;
		
	}

}
