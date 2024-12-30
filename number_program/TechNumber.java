package number_program;

import java.util.Scanner;

public class TechNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		int num1 = num;

		int count = 0;

		while (num1 > 0) {
			count++;
			num1 /= 10;
		}
		if (count % 2 == 0) {
			int div = 1;
			for (int i = 0; i < count/2; i++) {
				div = div * 10;
			}
			int a1 = num / div;
			int a2 = num % div;
			int sum = a1 + a2;

			int sqr = sum * sum;

			if (sqr == num) {
				System.out.println(num + " is Tech Number.");
			} else {
				System.out.println(num + " is Not Tech Number.");
			}
		} else {
			System.out.println("We Cannot perform operation");
		}

	}
}
