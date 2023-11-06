package evenNumberDivByThree;

import java.util.Scanner;

public class oddNumDivbyFive {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int res=divByFive(n);
		
		
	} 
	public static void divByFive(int n)
	{
		for (int i=0;i<n;i++)
		{
			if (n%2!=0)
			{
				if (n%5==0)
				{
					System.out.println("the num that are divisible by 5 and odd num are:"+i);
				}
			}
				
		}
	}

}
