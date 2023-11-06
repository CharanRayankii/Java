package com.prep.day2;

import java.util.Scanner;

public class Table {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int num=scan.nextInt();
	TableApp app=new TableApp();
	app.mult(num);
}
}
