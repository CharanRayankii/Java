
public class methodArr {
	public static void printYears(long minutes)
	{
		long days=(minutes/(24*60));
		long  year= (days/365);
		long remainderdays=days %365;
		
		System.out.println(year+"year &"+remainderdays+"days");
	}

}
