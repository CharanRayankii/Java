package WhileLoop;

import java.util.Scanner;

public class OddDigitSum {
public static void main(String[] args) {
	 Scanner scan=new Scanner(System.in);
	 int num=scan.nextInt();
	 int res=oddSum(num);
	 System.out.println(res);
	 
}
public static int oddSum(int num)
{
	int rem=0;
	int oddCount=0;
	while (num !=0)
	{
		rem=num%10;
		if(rem%2==1)
		{
		oddCount=oddCount+rem;	
		}
		num=num/10;
	}
	return oddCount;
}
}
