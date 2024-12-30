package pattern_program;

import java.util.Scanner;

public class Diamond_Pattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows you want to print: ");
		int row = sc.nextInt();
		int space = row - 1;
		for (int j = 1; j <= row; j++) {
			for (int i = 1; i <= space; i++) {
				System.out.print(" ");
			}
			space--;
			for (int i = 1; i <= 2 * j - 1; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		space = 1;
		for (int j = 1; j <= row - 1; j++) {
			for (int i = 1; i <= space; i++) {
				System.out.print(" ");
			}
			space++;
			for (int i = 1; i <= 2 * (row - j) - 1; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
