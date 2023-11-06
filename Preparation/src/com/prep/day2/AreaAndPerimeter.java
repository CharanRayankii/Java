package com.prep.day2;

import java.util.Scanner;

public class AreaAndPerimeter {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int radius=scan.nextInt();
		AreaOfCircle circle=new AreaOfCircle();
		PerimeterOfCircle peri=new PerimeterOfCircle();
		double res=circle.Area(radius);
		double res1=peri.perimeter(radius);
		System.out.println(res);
		System.out.println(res1);
		
		
		
	}

}
