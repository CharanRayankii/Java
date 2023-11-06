package Encapsulaion;

public class ExampleDog {
	private String name ;
	private String color;
	private String breed;
	private int age;
	 
	
	public ExampleDog(String name, String color, String breed, int age)
	{
		this.name =name;
		this.color=color;
		this.breed=breed;
		this .age=age;
		
	}
public String getname( )
{
	return name ;
}
public String getcolor() {
	return color;
}
public  String getbreed() {
	return breed;
}
public  int  getage() {
	return age;
}
	

}
