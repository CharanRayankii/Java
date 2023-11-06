import java.util.Scanner;

public class StaticCalculatr {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter numbers to perform operation");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("enter which operation to perform ");
		
	}
	public static void result(int a,int b ,char ch)
	{
		System.out.println("enter operation to perform");
		switch(ch)
		{
		case 1:
			 System.out.println(a+b);
		case 2:
			System.out.println(a-b);
		case 3: 
			System.out.println(a*b);
		case 4:
			System.out.println(a/b);
		case 5:
		System.out.println(a%b);
		default:
			System.out.println("no operation");
		}
		
		
		
	}

}
