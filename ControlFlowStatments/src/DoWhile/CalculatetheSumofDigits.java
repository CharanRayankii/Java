package DoWhile;

import java.util.Scanner;

public class CalculatetheSumofDigits {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a num to find the sum of digits");
		int num=scan.nextInt();
		int rem,sum=0;
		
		do {
			rem =num%10;
			 sum=sum+rem;
			 num=num/10;
		}
		while(num !=0);
		System.out.println(sum);
	}

}
