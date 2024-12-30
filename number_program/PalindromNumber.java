package number_program;

import java.util.Scanner;

public class PalindromNumber {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		int num1 = num;
		int rev = 0;
		
		while( num1 > 0 ) {
			int rem = num1 % 10;
			rev = rev * 10 + rem;
			num1 /= 10;
		}
		
		if(num == rev) {
			System.out.println(num+" is Palindrom.");
		}else {
			System.out.println(num+" is Not Palindrom.");
		}
	}
}
