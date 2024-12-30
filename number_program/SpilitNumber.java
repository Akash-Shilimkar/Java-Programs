package number_program;

import java.util.Scanner;

public class SpilitNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		int num1 = num;
		int c = 0;
		
		while( num1 > 0) {
			c++;
			num1 /= 10;
		}
		
		if( c%2 == 0) {
			int div =1;
			for(int i=1;i<= c/2;i++) {
				div = div * 10;
			}
			int a = num / div;
			int b = num % div;
			System.out.println("Spilit Number is : "+"Number 1 = "+a + " Number 2 = " +b);
		} else {
			System.out.println("Number Cannot Spilit");
		}
		
		
	}
}
