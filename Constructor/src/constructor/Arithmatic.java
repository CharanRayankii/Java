package constructor;

import java.util.Scanner;

public class Arithmatic {
	@SuppressWarnings("static-access" )
	
	public static void main(String[] args) {
		
	
	Scanner scan=new Scanner(System.in);
	int a=scan.nextInt();
	int b=scan.nextInt();
	ArithmeticApp a1=new ArithmeticApp();
	System.out.println(a1.add(a, b));
	a1.sub(a,b);

	
	}
}
class ArithmeticApp{
	public  int add(int a,int b)
	{
		
		return a+b;
		
	}
	public static int sub(int a, int b)
	{
		return a-b;
		
	}
	public static int mul(int a , int b)
	{
		return a*b;
	}
}
	
