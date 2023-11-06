package ThreeNumChecker;

import java.util.Scanner;

public class ThreeNumChecker {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		ThreeNumCheckerApp chheck=new ThreeNumCheckerApp();
		chheck.printEqual(a,b,c);
	}

	
		
	

}
