package com.Codingbat;

public class StartingWithOZ {

	public String startWith(String str)
	{
		if (str.substring(0).equals("o") || str.substring(1).equals("o"))
		{
			return "o";
		}
		if (str.substring(0).equals("z") || str.substring(1).equals("z"))
		{
			return "z";
		}
		return "";
		
	}
}
