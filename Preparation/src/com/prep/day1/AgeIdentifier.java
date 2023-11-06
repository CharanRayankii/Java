package com.prep.day1;

import java.util.Scanner;

public class AgeIdentifier {
	public static void calculator(int age)
	
	{
		if (age<0)
		{
			System.out.println("invalid age");
		}
		else if (age>0 && age<=13)
		{
		
			System.out.println("child");
		}
		else if( age >13 && age <=21)
		{
			System.out.println("adult");
		}
		else if(age >21 && age<40)
		{
			System.out.println("young");
		}
		else
		{
			System.out.println("senior citizen");
		}
	}
	
	
	
	

}
