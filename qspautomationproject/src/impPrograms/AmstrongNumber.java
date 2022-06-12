package impPrograms;

import java.util.Scanner;

public class AmstrongNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();

		int temp = n;
		int i = temp;
		int count = 0;
		int sum = 0;

		while (n > 0) {
			count++;
			n = n / 10;
		}

		while (temp > 0) {
			int r = temp % 10;
			sum = (int) (sum + power(r, count));
			temp = temp / 10;

		}

		if (i == sum) {
			System.out.println("Given Number is Amstrong Number");
			
		} 
		else
        {
			System.out.println("Given Number is Not Amstrong Number");
		}

	}

	public static double power(int base, int exponent) {

		double power = Math.pow(base, exponent);
		return power;

	} 

}
