package impPrograms;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		
		int temp=n;
		int a=0;
		while(n>0)
		{
			int r=n%10;
			a=(a*10)+r;
			n=n/10;
		}
		if(temp==a) 
		{
			System.out.println("Its a Palindrome Number");
		}
		else
		{
			System.out.println("Its Not Palindrome Number");
		}
	}

}
