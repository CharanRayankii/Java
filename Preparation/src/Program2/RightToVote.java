package Program2;

import java.util.Scanner;

public class RightToVote {
	public static void main(String[] args) {
		Scanner scan =new  Scanner(System.in);
		int age =scan.nextInt();
		RigthToVoteApp app=new RigthToVoteApp();
		app.identify(age);
	}

}
