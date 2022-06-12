package impPrograms;

import java.util.Scanner;

public class StrongNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		
		int temp=n;
		int sum=0;
		while(n>0) 
		{
			int r=n%10;
			sum=sum+fact(r);
			n=n/10;
		}
		
		if(temp==sum)
		{
			System.out.println("Given Number is Strong Number");
		}
		else
		{
			System.out.println("Given Number is Not Strong Number");
		}
			
	}
	public static int fact(int a)
	{
		int fact=1;
		for(int i=1;i<=a;i++) 
		{
			fact=fact*i;
		}
		return fact;
	}

}
