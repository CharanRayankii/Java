package constructor;

import java.util.Scanner;
		
public class Student {

	int id;

	String name;

	int marks;

	public Student(int id, String name, int marks) {
	
		this.id = id;
	
		this.name = name;
	
		this.marks = marks;
	
			}

		public void study()
	
			{
	
			System.out.println(name+" is studying");
	
			}
		public void coding()
		{
			System.out.println(name +" is coding ");
		}

			

			
	}


