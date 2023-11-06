package com.prepinsta.playingcat;

import java.util.Scanner;

import javax.security.sasl.SaslException;

public class PlayingCat {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("whether it is summer of not");
		boolean summer =scan.nextBoolean();
		System.out.println("enter the tempratuure");
		int temp=scan.nextInt();
		PlayingCatApp app=new PlayingCatApp();
		
		boolean res = app.plays(summer, temp);
		if (res== true)
		{
			System.out.println("true : catis playing");
			
		}
		else 
		{
			System.out.println("false: cat is not plafying");
		}
		
	}

}
