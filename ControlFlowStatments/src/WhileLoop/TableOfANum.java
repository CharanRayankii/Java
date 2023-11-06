package WhileLoop;

import java.util.Scanner;

public class TableOfANum {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int num =scan.nextInt();
		table(num);
		
	}
	public static void table(int num)
	{int table =1;
		while (table !=11)
		{
			int resnum=num*table;
			System.out.println(num +" * "+ table+" = "+resnum);
			table ++;
		}
	}

}
