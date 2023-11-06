package prepInsta.exercise;

import java.util.Scanner;

public class PrintingTableApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int  num=scan.nextInt();
		PrintingTable table=new PrintingTable(num);
		
		table.printTable();
	}

}
