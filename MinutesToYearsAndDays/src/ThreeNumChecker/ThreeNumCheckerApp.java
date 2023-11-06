package ThreeNumChecker;

public class ThreeNumCheckerApp {
	public  void printEqual(int a, int b, int c) {
		
		if (a==b && a==c)
		{
			System.out.println("All numberes are equal");
		}
		else if(a==b && b==c)
		{
			System.out.println("Neither equal or different");
		}
		else if(a<0 &b<0 &c<0)
		{
			System.out.println("Invalid Value");
			
		}
		else
		{
			System.out.println("All numbers are diferent");
		}
		
		
	}

}
