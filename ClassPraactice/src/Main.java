import java.util.Scanner;

public class Main 
	{
		public static void main(String[] args) 
		{ 
			Scanner scan=new Scanner(System.in);
			double value=scan.nextDouble();
			Meter m=new Meter(value);
			Centimeter cm=new Centimeter(value);
			cm.convertor();
			Kilometer km=new Kilometer(value);
			km.convertor();
			
			
			
		}
	}
