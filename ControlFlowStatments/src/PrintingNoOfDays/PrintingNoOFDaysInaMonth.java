package PrintingNoOfDays;

import java.util.Scanner;

public class PrintingNoOFDaysInaMonth {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter The month Number ");
	int month=scan.nextInt();
	System.out.println("Enter the year");
	int year =scan.nextInt();
	Finds find=new Finds();
	String res= find.month(month);
	System.out.println(year +" " + res);
	
}
}
class Finds
{
	String month(int num)
	{
		String Month;
		if (num>0 && num<=12)
		{
			switch (num)
			
			{
			case 1:
				return "January 31 days";
				
			case 2:
				return "February 28 days";
				
			case 3:
				return "March 31 days";
				
			case 4:
				return "April 30 days";
					
			case 5:
				return "May 31 days";
		
			case 6:
				return "June 30 days";
				
			case 7: 
				return "July 31 days";
				
			case 8:
				return "August 30 days ";
				
			case 9:
				return "September 31 days ";
				
			case 10:
				return "October 30 days ";
			
			case 11:
				return "November 31 days";
				
			case 12:
				return "December 30 days";
				
				
			}
			
		}
		
		return "invalid month";
		
		}
	
		
	
}
