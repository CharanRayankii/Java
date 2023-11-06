package identifyShape;

import java.util.Scanner;

public class Main {
	public static void shape(int sides)
	{
		int i=sides;
		if(i==3)
			{
				System.out.println("triangle");
				
			}
			else if(i==4)
			{
				System.out.println("auadilateral");
			
			}
			else if(i==5)
			{
				System.out.println("pentagon");
				
			}
			else if(i==6)
			{
				System.out.println("hexagon");
			
			}
			else if (i==7)
			{
				System.out.println("polygon");
				
			}
			else
			{
				System.out.println("no shape");
			}
		
		
		
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter no of sides to identify shape");
		int sides=scan.nextInt();
		shape(sides);
		scan.close();
		
	}
}
