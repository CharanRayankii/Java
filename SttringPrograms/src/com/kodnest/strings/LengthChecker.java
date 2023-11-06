package com.kodnest.strings;

import java.util.Scanner;

public class LengthChecker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str1 = scanner.nextLine();
		String str2 = scanner.nextLine();
		
		
		LengthCheckerApp lengthCheckerApp=new LengthCheckerApp();
				lengthCheckerApp.checker(str1, str2);
		
	}

}
