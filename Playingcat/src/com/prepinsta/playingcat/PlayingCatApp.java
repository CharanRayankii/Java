package com.prepinsta.playingcat;

public class PlayingCatApp {
	public static boolean plays(boolean summer , int temparture)
	{
		if (summer == false && temparture<35 && temparture>25)
		{
			return true;
		}
		else {
			return false;
		}
	}

}
