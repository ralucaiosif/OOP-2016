package largestPalindrome;
import java.lang.String;

public class LargestPalindrome {


		public static void main(String[] args) {
			// inverval: [100,999]
			
			int maxPalindrome=1;
			for (int num1=100; num1<=999; num1++)
			{
				for (int num2=num1+1; num2<999; num2++)
				{
					int product= num1 * num2;
					if (checkPalindrome(product)== true) 
					{
						if (product > maxPalindrome)
							maxPalindrome = product;
						
					}
					
				}
			}
			System.out.println("Largest palindrome found is: "+ maxPalindrome);

		}
		
		public static boolean checkPalindrome(int number)
		{
			String numToCheck= Integer.toString(number);
			String reverse="";
			for (int i=numToCheck.length()-1; i>=0; i--)
			{
				char letter= numToCheck.charAt(i);
				reverse= reverse+ letter;
				
			}
			if (reverse.compareTo(numToCheck)== 0)
				return true;
			else return false;
			
		}

	}


