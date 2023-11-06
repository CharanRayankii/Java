package com.prep.day2;

import java.util.Scanner;

public class AveerageOfNumbers {
	public static void main(String[] args) {
		System.out.println("enter 3 nu0mbers");
		Scanner scan=new Scanner(System.in);
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int num3=scan.nextInt();
		int average=(num1+num2+num3)/3;
		System.out.println(average);
	}

}
