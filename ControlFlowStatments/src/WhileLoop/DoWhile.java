package WhileLoop;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int start=scan.nextInt();
		int end=scan.nextInt();
		do {
			
			if (isOdd(start))
			{
				
				System.out.println("odd num is "+start);
			}
			start++;
		}while(start<=end);
		
		
	}
	public static boolean isOdd(int num)
	{
		if (num>0)
		{
			if (num%2==1)
			{
				return true;
			}
			
			
	}
		
		return false;

}
}
