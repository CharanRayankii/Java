package Encapsulaion;

public class HowSetterGetterWorksApp {
	public static void main(String[] args) {
		HowSetterGetterWork getterWork=new HowSetterGetterWork();
		getterWork.setId(1);
		getterWork.setName("cherry");
		getterWork.setMarks(99);
		getterWork.setGender("male");
		System.out.println(getterWork.getId()+" "+getterWork.getName()+" "+getterWork.getMarks()+" "+getterWork.getGender());
				
	}

}
