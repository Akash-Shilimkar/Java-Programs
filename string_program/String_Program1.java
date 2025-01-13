package string_program;

import java.util.Scanner;

public class String_Program1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			System.out.println(ch);
		}
	}
}
