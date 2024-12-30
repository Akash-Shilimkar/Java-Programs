package number_program;

import java.util.Scanner;

public class KarprekarNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		int sqr = num * num;
		int num1 = num;
		int count = 0;
		
		while( num1 > 0) {
			count++;
			num1 /= 10;
		}
		int div = 1;
		for(int i = 0; i < count; i++) {
			div = div * 10;
		}
		int a1 = sqr / div;
		int a2 = sqr % div;
		int sum = a1 + a2;
		
		if(sum == num) {
			System.out.println(num+" is Karprekar Number.");
		} else {
			System.out.println(num+" is Not Karprekar Number.");
		}
	}
}
