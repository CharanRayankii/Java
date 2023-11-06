package prepInsta.exercise;



public class PrintingTable {
	
	private int num;
	
	public void printTable()
	
	{
		for (int i=1;i<=10;i++)
		{
			System.out.println(num+"* "+i+"= "+num*i);
		}
	
	}
	public PrintingTable(int num)
	{
		this.num=num;
	}
}
