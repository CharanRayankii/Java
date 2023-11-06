package SwitchStatment;

import java.util.Scanner;

public class FindingVowel {
	public static void main(String[] args) {
		
		
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter char to find the vowel or not");
		char ch=scan.next().charAt(0);
		switch (Character.toUpperCase(ch))
		{
		case 'A': case 'E': case 'I': case 'O': case 'u':
			System.out.println("vowel");
			break;
			default:
				System.out.println("Not vowel");
		}
	}
	
	
	

}
