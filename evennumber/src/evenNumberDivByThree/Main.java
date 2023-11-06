package evenNumberDivByThree;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		divByThree(n);
	}
	public static void divByThree(int n)
	{
		for (int i=1;i<n;i++)
		{
		if (i%2==0)
		{
			if (i%3==0)
			{
				System.out.println("number that are div by three are:"+i);
			}
		}
		
	}
	}

}
