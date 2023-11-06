
public class BinarySearchApp {

	public static int  search(int arr[], int key) {
		int low =0;
		int high =arr.length;
		while (low < high)
		{
			int mid = (low + high)/2;
			if (key==mid)
			{
				return mid;
				
			}
			else if(key <mid )
			{
				high =mid-1;
			}
			else if (key>mid)
			{
				low =mid +1;
			}
		}
		return-1;
	}
}
