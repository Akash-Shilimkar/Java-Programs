package string_program;

import java.util.Scanner;

public class Check_Vowels_Constantants {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String: ");
		String str = sc.nextLine();

		int c1 = 0;
		int c2 = 0; 

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
				ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				c1++;
			}
			else {
				c2++;
			}
		}
		System.out.println("There is " +c1 +" vowels are present.");
		System.out.println("There is " +c2 +" constants are present.");
	}
}
