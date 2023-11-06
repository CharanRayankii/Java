package DoWhile;

import java.util.Scanner;

public class CalculatingSumOfDigits {
	
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter a number ");
		int num=scan.nextInt();
		
		Calculator calc=new Calculator();
		int res=calc.calc(num);
		System.out.println(res);
	}
	
	

}
class Calculator 
{
	public static int calc(int num)
	{
		int rem=0;
		int count=0;
		do {
			
			rem=num%10;
			count =count +rem;
			num=num/10;
		}while (num !=0);
	
	return count;
	}
	
}
