package Shopping;

import java.util.Scanner;

public class ShoppingList {
	public String item(int item)
	{
		String item_name="";
		
		switch (item)
		
		{
		case 1:
			item_name ="fruits";
			System.out.println("item name :"+item_name );
			return item_name ;
		case 2:
			item_name="vegtables";
			System.out.println("item name :"+item_name );
			return item_name ;
		case 3:
			item_name ="drinks";
			System.out.println("item name :"+item_name);
			return item_name;
		case 4:
			item_name="flours";
			System.out.println("item name :"+item_name);
			return item_name ;
			default:
				System.out.println("wrong item chosen");
				
		}
		return item_name;
	}
	

}
