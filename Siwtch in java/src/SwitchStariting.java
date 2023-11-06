
public class SwitchStariting {
	public static void main(String[] args) {
		//switch statmetn
		int value=4;
		switch (value) {
		case 1:			
			System.out.println("value 1");
			break;
		case 2:
			System.out.println("value 2");
		case 3: case 4: case 5:
			System.out.println("value 3 and value 4 and value 5");
			break;
		
		default:
			System.out.println("defaault value");
		}
	}
}
