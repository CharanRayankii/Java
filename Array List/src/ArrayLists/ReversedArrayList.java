package ArrayLists;

import java.util.Scanner;

public class ReversedArrayList {
 public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	int arr[]=new int[scan.nextInt()];
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=scan.nextInt();
		
	}
	 int largest=0;
	for (int i=0;i<arr.length;i++)
	{
		if (arr[i]>arr[i+1])
		{
			largest=arr[i];
		}
	}
	System.out.println(largest);
			
	 
 }

}
