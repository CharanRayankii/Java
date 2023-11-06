package com.prep.day2;

import java.util.Scanner;

public class SwappingTwoNum {
	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
		 int num1=scan.nextInt();
		 int num2=scan.nextInt();
		 int temp;
		  temp=num1;
		  num1=num2;
		  num2=temp;
		  System.out.println(num1);
		  System.out.println(num2);
	}

}
