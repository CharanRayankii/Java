package com.prep.self;

import java.util.Scanner;

public class FlourPaackPRoblemApp {
	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		
		int bigCount=scan.nextInt();
		int smallCount=scan.nextInt();
		int goal=scan.nextInt();
				
		FlourPackProblem flo=new FlourPackProblem();
		
		boolean res=flo.canpack(bigCount, smallCount, goal);
		System.out.println(res);
		
	}

}
