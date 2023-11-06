import java.util.Scanner;

public class AreaOfRectangle {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int length=scan.nextInt();
		int bredth=scan.nextInt();
		int res=area(length,bredth);
		System.out.println(res);
		
	}
	
	public static int area(int l,int b)
	{
		int area=l*b;
		return area;
		
	}

}
