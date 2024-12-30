package number_program;

import java.util.Scanner;

public class Even_Odd_Num {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Starting number : ");
		int num = sc.nextInt();
		System.out.println("Enter a Ending number : ");
		int num1 = sc.nextInt();
		
		for(int i = num; i<= num1; i++) {
			if(i % 2 == 0) {
				System.out.println(i+" is Even number");
			} else {
				System.out.println(i+" is Odd number");
			}
		}
	}
}
