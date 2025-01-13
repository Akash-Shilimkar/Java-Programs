package string_program;

import java.util.Scanner;

public class Reverse_String_SB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string : ");
		String str = sc.nextLine();
		
		StringBuffer stringBuffer = new StringBuffer(str);
		String revrseString = stringBuffer.reverse().toString();
		
		System.out.println("Revrse String is: "+revrseString);
	}
}
