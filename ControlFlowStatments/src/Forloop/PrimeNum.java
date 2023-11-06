package Forloop;

import java.util.Scanner;

public class PrimeNum {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter a number to check whether it is prime or not ");
	int num =scan.nextInt();
	Prime prime=new Prime();
	prime.isPrime(num);
}
}
class Prime 
{
	void isPrime(int num)
	{
		int count =1;
		for (int i=1;i<num;i++)
		{
			if (num %i==0)
			{
				count =count +1;
			}
		}
		if (count>2 )
		{
			System.out.println(num+" not prime num");
		}
		else
		{
			System.out.println(num+" is prime ");
		}
	}
}