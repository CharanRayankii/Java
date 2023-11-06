package Forloop;

import java.util.Scanner;

import javax.security.sasl.SaslException;

public class PerfectNum {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int num=scan.nextInt();
		for (int i=1;i<=num;i++)
		{
		isPerfect(i);
		}
		
	}
	public static void isPerfect(int num)
	{int count=0;
		for (int i=1;i<num;i++) 
		{
			if (num%i==0)
			{
				count =count+i;		
			}
		}
		if (count == num)
		{
			System.out.println("perfect num: "+num);
		
		}
		else
		{
			System.out.println("not perfect num: "+num);
		}
	}
	
}
