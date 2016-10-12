package prob1;

public class ZaLarjastPalindrom {
	static int  isPalindrome(String   produs[]) {
    int palindromeCheck = 1;
    for (int i = 0; i < produs.length / 2; i++) {
        if (produs[i] != produs[produs.length - i - 1])
            palindromeCheck = 0;
    }
    return palindromeCheck;

};


public static  void paraam()
{
int max=0;
int produs=1;
for (int num1 = 999; num1 >= 100; num1--) {
for (int num2 = 999; num2 >= 100; num2--) {
    produs = num1 * num2;

String  convertit = Integer.toString(produs);  
    if(produs > max && isPalindrome(convertit)==1)   max = produs  ;
    else max=0;
}
}
System.out.println(max);
}

public static void main(String[] args) {
paraam();	
}
}
