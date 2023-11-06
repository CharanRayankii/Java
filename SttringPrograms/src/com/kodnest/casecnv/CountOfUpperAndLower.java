package com.kodnest.casecnv;

import java.util.Scanner;

public class CountOfUpperAndLower {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str1=scanner.nextLine();
		ConverUpperCase upperCase=new  ConverUpperCase();
		upperCase.convertor(str1);
	}

}
