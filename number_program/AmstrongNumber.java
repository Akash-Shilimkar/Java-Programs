package number_program;

import java.util.Scanner;

public class AmstrongNumber {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		int a = num;
		int b = num;
		int c = 0;
		int sum = 0;
		
		while( a > 0 ) {
			c++;
			a /= 10;
		}
		while( b > 0 ) {
			int rem = b % 10;
			int pow = 1; 
            for (int i = 0; i < c; i++) { 
                pow *= rem;
            }
            sum += pow;
			b /= 10;
		}
		if(sum == num) {
			System.out.println(num+ " is Amstrong Number.");
		} else {
			System.out.println(num+ " is Not Amstrong Number.");
		}
	}
}
