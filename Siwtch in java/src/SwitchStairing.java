import java.util.Scanner;

public class SwitchStairing {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int cost=scan.nextInt();
		String color=scan.next();
		SwitchStairing bp=new SwitchStairing();
		String res=bp.pen(cost, color);
		System.out.println(res);
		
		
		
	}
	
	
	
	
	public String pen(int cost,String color)
	
	
	{
		
		if (cost==3 || cost ==5|| cost==10)
		{
			
		
			
			switch (color) {
			case "red":  case "marron red":
				
				return "Red color Pen "+cost+" Rupees";
				
				case "Blue":
					return "Blue color pen"+cost+"rupees";
				case "Black":
					return "black color pen "+cost+"rupees";
				
			
			default:
				return "No Pens Available At this price";
			}
		
		
		}
		
		
	
  
		
      
      
    
	return "No pens Available";
	}




	
}
