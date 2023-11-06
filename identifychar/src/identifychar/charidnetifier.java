package identifychar;

import java.util.Scanner;

public class charidnetifier {
public static void main(String[] args) {
	Scanner scan=new Scanner (System.in);
	System.out.println("enter a char");
	char ch=scan.next().charAt(0);
	identifychar(ch);
	scan.close();
			
}

private static void identifychar(char ch) {
	// TODO Auto-generated method stub
	
	if (Character.isDigit(ch))
	{
		System.out.println("entereed character is"+ch+"digit");
		
	}
	else if (!Character.isLetter(ch) )
			{
				System.out.println("entered charactris"+ch+"special character");
			}
	else
	{
		switch (Character.toLowerCase(ch)) {

		case 'a':

		case 'e':

		case 'i':

		case 'o':

		case 'u':

		if(Character.isLowerCase(ch))

		{

		System.out.println("Entered Character "+ch+" Is Lower Case Vowel");

		}

		else

		{

		System.out.println("Entered Character "+ch+"Is Upper Case Vowel");

		}

		break;

		default:

		if(Character.isLowerCase(ch))

		{

		System.out.println("Entered Character "+ch+" Is Lower Case Consonent");

		}

		else

		{

		System.out.println("Entered Character "+ch+" is Upper case Consonent");

		}
	}
			
	
}
}
}
