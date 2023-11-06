import java.util.Scanner;

class Meter { 
	double value;
	public Meter(double value) {
		this.value = value;
		} 
	} 
class Centimeter extends Meter {

	public Centimeter(double value) {
		super(value);
		
		
	}
	public void convertor ()
	{
		double res=value *100;
		System.out.println(res+" cm");
		
		
	} 
}
	
	class Kilometer extends Meter {

		public Kilometer(double value) {
			super(value);
			
	
	
	}
		public void convertor()
		{
			double res=value/1000;
			System.out.println(res+" km");
		}
	}
	
	
	