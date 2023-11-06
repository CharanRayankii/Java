package LostDigitChecker;

import java.util.Scanner;

public class LostDigitChecker {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int num =scan.nextInt();
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		if (num >10 && num<1000 && num1>10 && num1 <1000 && num2>10 && num2<1000 )
		{
		num=num%10;
		num1=num1%10;
		num2=num2%10;
		if(num==num1 || num==num2 || num1==num2)
		{
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		}
		else 
			System.out.println("false");
	}

}
