package DoWhile;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int rem;
		int arr[]=new int[100];
		int i=0;
		while (num!=0)
		{
			rem=num%2;
			arr[i]=rem;
			i++;
			num=num/10;
			
			
			
		}
		for (int j=0;j<i;j++)
		{
			System.out.print(arr[j]);
		}
		
			
		
	}

}
