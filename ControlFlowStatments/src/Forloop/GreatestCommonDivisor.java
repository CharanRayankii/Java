package Forloop;

import java.util.Scanner;

public class GreatestCommonDivisor {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter two num to find gcd");
		int num1= scan.nextInt();
		int num2=scan.nextInt();
		int greatest=0;
		for (int i=1;((i<=num1) && (i<=num2));i++)
		{
			if ((num1%i==0) && (num2%i==0))
			{
				greatest=i;
			}
		}
		System.out.println(greatest);
	}

}
