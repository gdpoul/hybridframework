package impPrograms;

import java.util.Scanner;

public class ReverseNumber {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		
		int a=0;
		while(n>0) 
		{
			int r=n%10;
			a=(a*10)+r;
			n=n/10;
		}
		System.err.println("Reverse Number is "+a);
	}

}
