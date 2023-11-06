package constructor;

public class Demo {
	public static void main(String[] args) {
		Student stu=new Student(12, "cherry", 23);
		String str = new String("rama");
		System.out.println(str);
		System.out.println(stu);
		var a=10;
		
		var b='r';
		var c="";
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		var d=3.47;
		System.out.println(d);
		//System.out.println(a.getclass());
		String str1 =new String();
		System.out.println(c.getClass());
	}

}
