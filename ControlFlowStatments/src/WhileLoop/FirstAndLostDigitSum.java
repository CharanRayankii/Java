package WhileLoop;

import java.util.Scanner;

public class FirstAndLostDigitSum {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		sum(num);
		
	}
	static void sum(int num)
	{
		int first=0; 
		int lost=num%10;
		while(num !=0)
		{
			if(num/10==0)
			{
				first=num%10;
			}
		num=num/10;
		}
		System.out.println(first+lost);
	}
	

}
