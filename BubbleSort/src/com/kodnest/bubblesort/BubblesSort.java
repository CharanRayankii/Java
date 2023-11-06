package com.kodnest.bubblesort;

import java.util.Scanner;

public class BubblesSort {
	
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		int arr[]=new int[scan.nextInt()];
		
		
		for (int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		BubbleSortApp app=new BubbleSortApp();
		app.sort(arr);
	}

}
