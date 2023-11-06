package Encapsulaion;

import java.util.Scanner;

public class main {
	Scanner scan=new Scanner(System.in);

	private int radius=scan.nextInt();
	public void setradius(int radius)
	{
		 this.radius=radius;
	}
	public int getRadius()
	{
		return radius;
	}
	
}
