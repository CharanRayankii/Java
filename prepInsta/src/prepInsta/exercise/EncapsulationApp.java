package prepInsta.exercise;

public class EncapsulationApp {
	public static void main(String[] args) {
		Encapsulation ep=new Encapsulation();
		ep.setname("cherry");
		
		
		ep.setnum(12);
		
		ep.setage(12);
		
		System.out.println(ep.getname()+"   "+ep.getnum()+"  "+ep.getage());
		
	}

}
