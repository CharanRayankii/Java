package Student;

public class Student {
	
		int id;
		int marks;
		String name ;
		
	void study()
	{
		System.out.println(name +"student is studying");
		
	}
	public Student(int id,String name, int marks)
	{
		this.name =name;
		this .id=id;
		this.marks=marks;
	}
	

}
