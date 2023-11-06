package Shopping;

import java.util.Scanner;

public class SortingOfArray {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int arr[]=new int[scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
			
		}
		System.out.println("elements before sort ");
		printArray(arr);
		System.out.println("elements after sort");
		sortArray(arr);
		
		
	}

	public static void printArray(int arr[])
	{
		for (int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]);
		}
		
		//return arr;
		
	}
	public static void sortArray(int arr[])
	{
		int temp=0;
		for (int i=0;i<=arr.length-1;i++)
		{
			for (int j=i+1;j<=arr.length-1;j++)
			{
			if (arr[i]>arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
				
				
		}
		}
		printArray(arr);
		
		
	}
	
	
}
