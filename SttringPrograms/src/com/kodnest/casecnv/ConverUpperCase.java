package com.kodnest.casecnv;

public class ConverUpperCase {
	void convertor(String str1)
	{
		int upper=0;
		int lower=0;
		
		for(int i=0;i<=str1.length()-1;i++)

		{

		int unicode=(int)str1.charAt(i);
		if (unicode>=65 && unicode<=90)
		{
			upper++;
			
			
		}
		else
		{
			lower++;
			
		}

		

		}
		System.out.println("Upper count:"+upper+"  ");
		System.out.print("lower count: "+lower+"  ");
		
		
		
	}
	
	

}
