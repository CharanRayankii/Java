package com.kodnest.stringspro;

import java.util.Scanner;

public class ConctinatedString {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str1 = scanner.nextLine();
		String str2 = scanner.nextLine();
		
		
		ConctinatedStringApp app=new  ConctinatedStringApp();
		int x=app.conctinate(str1, str2);
		if (x==0)
		{
			System.out.println("conc strings are equal");
			
		}
		else 
		{
			System.out.println("strings are not equal");
		}
	}
}
