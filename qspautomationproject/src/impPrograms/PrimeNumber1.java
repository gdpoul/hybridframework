package impPrograms;

import java.util.Scanner;

public class PrimeNumber1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		int r = 0;
		for (int i = 1; i <= n; i++) {

			if (n % i == 0) {
				r++;
			}
		}
		if (r == 2) {
			System.out.println("Its a Prime Number");
		} else {
			System.out.println("Its not a Prime Number");
		}

	}

}
