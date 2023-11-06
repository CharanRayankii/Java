package DoWhile;

import java.util.Scanner;

public class FindingPalindromeNum {
	public static void main(String[] args) {
		Scanner scan =new Scanner( System.in);
		int num=scan.nextInt();
		String str=palindrome(num);
		System.out.println(str);
		
	}
	public static String palindrome(int num)
	{
		int temp=num;
		int reverse=0;
		int rem=0;
		do {
			rem=temp%10;
			reverse=reverse*10+rem;
			temp=temp/10;
		}while (temp !=0);
		
		if (num==reverse)
			return "palindrome";
		else
			return "not Palindrome";
	}

}
