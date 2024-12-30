package number_program;

import java.util.Scanner;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number fibonacci series till : ");
		int num = sc.nextInt();
		
		System.out.println("Enter frist number fibonacci series : ");
		int a = sc.nextInt();
		
		System.out.println("Enter second number fibonacci series : ");
		int b = sc.nextInt();
		
	    System.out.println("Fibonacci Series till " + num + " terms:");

	    for (int i = 1; i <= num; ++i) {
	      System.out.print(a + ", ");

	      // compute the next term
	      int nextTerm = a + b;
	      a = b;
	      b = nextTerm;
	    }
	  }

}
