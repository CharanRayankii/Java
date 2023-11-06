import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int arr[]=new int[scan.nextInt()];
		for (int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
			
			
		}
		System.out.println("enter key to search");
		int key =scan.nextInt();
		BinarySearchApp app=new BinarySearchApp();
		int res=app.search(arr, key);
		if (res==-1)
		{
			System.out.println("element not found");
		}
		else
		{
			System.out.println("element "+res+"found ");
		}
		
		
	}

}
