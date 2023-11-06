package Shopping;

public class ShoppingCart extends ShoppingList{
	public double bill(String item_name)
	{
		double cost = 0;
		if (item_name=="fruits")
		{
			cost=40.0;
		}
		 if (item_name =="vegtables")
		{
			cost=36.6;
			
		}
		if (item_name=="flours")
		{
			cost=42.4;
		}
		if(item_name =="drinks")
		{
			cost=20.2;
		}
		return cost;
	}

}
