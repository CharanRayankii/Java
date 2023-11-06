package ArrayLists;

import java.util.Scanner;

//returning substring 
class Example{
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		String str=scan.next();
		int n=scan.nextInt();
		
		str(str,n);
		
	}
	public static void str(String str,int n)
	{
		int n1=str.length();
		int n2=n1-n;
		//int n3=
		char ch[]=str.toCharArray();
		char ch1[]=new char[n];
		char ch2[]=new char[n2];
		int j=0;
		int k=0;
		for(int i=0;i<ch.length;i++)
		{
			if (i<n);
			{
				ch1[j]=ch[i];
				j++;
			}
			if (i>n)
			{
				ch2[k]=ch[i];
				k++;
			}
		}
		String Str2=ch1.toString();
		String str3=Str2+ch2.toString();
		System.out.println(str3);
		
	}
	
	
}