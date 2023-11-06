package Forloop;

import java.util.Scanner;

	public class SumOfAllEvenNumInBetweenRange {
		
		public static void main(String[] args) {
			
			Scanner scan=new Scanner(System.in);
			
			int start=scan.nextInt();
			int end =scan.nextInt();
			isEven(start, end);
			
		
		}
		public static void isEven(int start ,int end)
		{int EvenSum=0;
		
		if (start>0&&end>0) {
			for (int i=start;i<=end ;i++)
			{
				if (i%2==0) {
					EvenSum=EvenSum+i;
				System.out.println("EvenNum "+i);
				}
			}
			System.out.println("sum  is "+EvenSum);
		}
		}
		

	}


