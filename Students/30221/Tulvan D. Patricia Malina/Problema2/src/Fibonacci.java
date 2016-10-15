
public class Fibonacci {
	public static int fib ( ){
		int a=1,b=2,c=0,sum=0;
		while(sum<4000000)
		{
			c=a+b;
			a=b;
			b=c;	
			if(a%2==0 && a!=0 )
			{
				sum+=a;
				if(sum>4000000)
					return sum-a;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int sumFib;
		sumFib=fib();
		System.out.println("Suma este " +sumFib);
	}

}
