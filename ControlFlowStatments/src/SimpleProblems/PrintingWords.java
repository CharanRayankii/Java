package SimpleProblems;

import java.util.Scanner;

public class PrintingWords {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int num=scan.nextInt();
		FindingNum res=new FindingNum();
		res.printWords(num);
		scan.close();
	}

}
class FindingNum
{
	 void  printWords(int num) {
		switch (num)
		{
		case 0:
			System.out.println("Zero");
			break;
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		case 6:
			System.out.println("Six");
			break;
		case 7:
			System.out.println("Seven");
			break;
		case 8:
			System.out.println("Eight");
			break;
		case 9:
			System.out.println("Nine");
		default:
			System.out.println("Other");
		}
		
	}
}
