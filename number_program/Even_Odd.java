package number_program;

import java.util.Scanner;

public class Even_Odd {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println(num+" is even number");
		} else {
			System.out.println(num+" is odd number");
		}
	}
}
