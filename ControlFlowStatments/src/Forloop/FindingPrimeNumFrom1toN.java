package Forloop;

import java.util.Scanner;

public class FindingPrimeNumFrom1toN {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		for(int i=1;i<num;i++)
		{
			isPrime(i);
		}
	}
	static void isPrime(int num)
	
	{ int count=0;
		for (int i=2;i<num;i++)
		{
			if (num%i==0)
			{
				count=count+1;
			}
		}
		if (count >0) {
			System.out.println(num+" not prime ");
		}
		else
		{
			System.out.println(num+" prime");
		}
		
			
		
	}

}
