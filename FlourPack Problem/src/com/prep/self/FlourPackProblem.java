package com.prep.self;

public class FlourPackProblem {
	public static boolean canpack(int bigCount,int smallCount,int goal)
	{
	if (bigCount <0 ||  smallCount<0 || goal<0)
	{
		return false;
	}
	
	if(((bigCount*5)+smallCount)<goal)
		{
			return false;
		}
	
	if (goal%5<=smallCount ) 
	{
	return true;
	}
	return false;
	
	}

}
