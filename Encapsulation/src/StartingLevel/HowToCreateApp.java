package StartingLevel;

public class HowToCreateApp {
	 private int temp;

	public int getTemp() {
		return temp;
	}

	public void setTemp(int x) {
		x=temp;
		if (x<25 && x>35)
		{
			System.out.println("temp");
		}
		else
		{
			System.out.println("Invalid tem");
		}
	}
	

}
