package com.Codingbat;

import java.util.Scanner;

public class StartingWithOZApp {
	public static void main(String[] args) {
		
	
	Scanner scan=new Scanner(System.in);
	String str=scan.next();
	StartingWithOZ oz=new StartingWithOZ();
	String res=oz.startWith(str);
	System.out.println(res);
	
	}

}
