import java.util.Arrays;


public class Spiral {

	public static void main(String[] args) {
		int n=3;
	    int matrix[][]= new int[n][];
		int oneRow[]= new int[n];
		int row,column;
		int value=1;
		do {
			for (row=0; row<n; row++)
			{
				Arrays.fill(oneRow, 0);
				matrix[row]= oneRow;
			}
			row=column= n/2;//start from the middle
			matrix[row][column]=value;
			do{
				++column;
				++value;
				matrix[row][column]=value;
			} while (column<n-1);
			do{
				--row;
				++value;
				matrix[row][column]= value; 
				
			} while (row>0);
			do{
				--column;
				++value;
				matrix[row][column]= value; 
			} while (column>0);
			do{
				++row;
				++value;
				matrix[row][column]= value; 
			} while ( row< n-1);
			do{ 
				++column;
				++value;
				matrix[row][column]= value; 
			} while(column< n-1);
		
			n+=2;
			
		} while ( ratioOfPrimes(matrix, n-2)==false);
		n-=2;
		for (row=0; row<n; row++)
		{
			for (column=0; column<n; column++)
			{
				System.out.print(matrix[row][column]);
			}
			System.out.println();
		}
		
	
	}
	
	public static boolean ratioOfPrimes(int matrix[][], int n){
		int row,column;
		int diagPrimes=0;
		for (row=0; row<n; row++)
			for (column=0; column<n; column++){
		{
			if (row==column){
				if (prime(matrix[row][column])== true)
					diagPrimes++;
			}
			if (row+column== n){
				if (prime(matrix[row][column])== true)
					diagPrimes++;
			}
		}
			}
		int numbersOnDiag= 2*n -1; 
		double procent= (double) diagPrimes/ numbersOnDiag;
		if (procent < 0.1) return true;
		else return false;
		
		 
	}
	
	public static boolean prime (int number){
		int index;
		for (index=2; index<number; index++)
		{
			if (number % index== 0) return false;
		}
		return false;
	}

}
