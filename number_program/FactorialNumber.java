package number_program;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();

		System.out.println("Enter a factorial number : ");
		int fact = sc.nextInt();
		for (int i = 1; i <= num; ++i) {
			// factorial = factorial * i;
			fact *= i;
		}
		System.out.printf("Factorial of " + num + " = " + fact);
	}
}
