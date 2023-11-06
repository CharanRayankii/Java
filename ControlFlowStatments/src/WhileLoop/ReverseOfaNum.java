package WhileLoop;

import java.util.Scanner;

public class ReverseOfaNum {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int num = scan.nextInt();
		reverse(num);
		
		
	}
	public static void reverse(int num)
	{
		int rev=0;
		int rem=0;
		int temp=num;
		while (temp !=0)
		{
			rem = temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		System.out.println(rev);
		if (rev==num)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}
	
	

}
