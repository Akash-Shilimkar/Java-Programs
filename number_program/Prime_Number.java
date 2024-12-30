package number_program;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Starting number : ");
		int num = sc.nextInt();
		System.out.println("Enter a Ending number : ");
		int num1 = sc.nextInt();
		System.out.println("Prime numbers between " + num + " and " + num1 + ":");
		for (int i = num; i <= num1; i++) {
			if (isPrime(i)) {
				System.out.println(i + " is a prime number.");
			}
		}
	}

	private static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
