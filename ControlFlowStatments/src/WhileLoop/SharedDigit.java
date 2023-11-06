package WhileLoop;

import java.util.Scanner;

public class SharedDigit {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		boolean ans=shared(a, b);
		System.out.println(ans);
		
		
				
	}
public static boolean shared(int a , int b)
{
	boolean answer =true;
	if (a>10  && a<99 && b>10 && b<99)
		
	{
		int a1=a%10;
		int a2=a/10;
		int b1=b%10;
		int b2=b/10;
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(b1);
		System.out.println(b2);
		if (a1==b1 || a1==b2 || b1==a1 || b2==a2)
			answer=true;
		else
			answer=false;
	}
	
	return answer;
	
}
}


