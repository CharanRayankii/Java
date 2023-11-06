package com.prep.day2;

import java.util.Scanner;

public class SwappingWithoutUsingTemp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int num1=scan.nextInt();
		num=num+num1;
		num1=num-num1;
		num=num-num1;
		System.out.println(num);
		System.out.println(num1);
		
		num=num*num1;
		num1=num/num1;
		num=num/num1;
		System.out.println(num);
		System.out.println(num1);
		num=num^num1;
		num1=num^num1;
		num=num^num1;
		System.out.println(num);
		System.out.println(num1);
				
	}

}
