package number_program;

import java.util.Scanner;

public class ReverseNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number which you want to Reverse: ");
		int a = sc.nextInt();
		int rev = 0;
		
		while( a > 0) {
			int rem = a % 10;
			rev = rev * 10 + rem;
			a /= 10;
		}
		System.out.println("Reverse Number is : " +rev);
	}
}

