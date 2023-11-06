package Shopping;

public class Wallet extends ShoppingCart
{
	
	public int remainindAmount(int cost,int walletbal)
	{
		
		if (walletbal>cost)
		{
			System.out.println("Remaining amount in your account is :");
		}
		return walletbal-cost;
		
		
	}
	public int recharge (int cost,int walletbal)
	{
		if (cost>walletbal)
		{
			System.out.println("amount is less please recharge :");
		}
		return cost-walletbal;
	}
	

}
