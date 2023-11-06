package Student;

public class StudentApp {
public static void main(String[] args) {
	
	
	Student s1=new Student(1, "rama", 99);
	Student s2=new Student(2, "sita", 98);
	Student s3=new Student(3, "bjishma ", 97);
	Student arr[]=new Student[3];
	arr[0]=s1;
	arr[1]=s2;
	arr[2]=s3;
	for (int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i].id+" "+ arr[i].name+" "+arr[i].marks);
	}
}
}
