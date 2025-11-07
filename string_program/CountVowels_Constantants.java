package string_program;

import java.util.Scanner;

public class CountVowels_Constantants {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String: ");
		String str = sc.nextLine();

		int count1 = 0;
		int count2 = 0; 
    char ch[] = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {

			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || 
				ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {
				count1++;
			}
			else {
				count2++;
			}
		}
		System.out.println("There is " +count1 +" vowels are present.");
		System.out.println("There is " +count2 +" constants are present.");
	}
}
