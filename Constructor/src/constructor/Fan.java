package constructor;

import java.util.Scanner;

public class Fan {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int res=method(a, b);
		System.out.println(res);
	}
	public static int method(int a,int b)
	{
		if (a>=10 && a<=10 && b>=10 && b<=20)
		{
			if (a>b)
			{
				return a;
			}
			if (a<b)
			{
				return b;
			}
		}
		if (a>20 || a<10 || b<10 || b>20)
		{
			
				if (a>b)
				{
					return a;
				}
				else
				{
					return b;
				}
			
		}
		return 0;
	}

}
