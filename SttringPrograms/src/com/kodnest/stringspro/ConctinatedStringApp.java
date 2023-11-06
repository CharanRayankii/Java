package com.kodnest.stringspro;

public class ConctinatedStringApp {
	int conctinate(String str1, String str2)
	{
		str1=str1.concat(str2);
		System.out.println("string after concitnated:"+str1 );
		if (str1==str2)
		{
			return 0;
			
		}
		return -1;
	}
	
	

}
