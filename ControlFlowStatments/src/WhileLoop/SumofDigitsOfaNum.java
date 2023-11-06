package WhileLoop;

import java.util.Scanner;

public class SumofDigitsOfaNum {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int count=0;
		int rem=0;
		while (num !=0)
		{
			rem=num%10;
			count =count+rem;
			num=num/10;
			
		}
		
		System.out.println(count);
	}

}
