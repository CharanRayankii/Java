package com.kodnest.strPro3;

import java.util.Scanner;

public class unicode {
	public static void main(String[] args) {
		Scanner scanner =new  Scanner(System.in);
		String next = scanner.next();
		System.out.println(next.codePointCount(0, next.length()));
	}

}
