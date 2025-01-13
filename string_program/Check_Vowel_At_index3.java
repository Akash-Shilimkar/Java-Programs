package string_program;

import java.util.Scanner;

public class Check_Vowel_At_index3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str[] = new String[5];
		char result = ' ';
		System.out.println("Enter the five Names : ");
		for(int i=0;i<str.length;i++)
		{
			str[i] = sc.next();
		}
		
		for(int i=0;i<str.length;i++)
		{
			 result = str[i].charAt(2);
			if(result =='a' ||result =='e' ||result =='i'||result =='o'||result =='u' ||
			   result =='A' ||result =='E' ||result =='I'||result =='O'||result =='U' )
			{
				System.out.println();
				System.out.println("In " +str[i]+" Vowel is present at index 3,"+"Vowel is : " +result);
			}else {
				System.out.println();
				System.out.println("In " +str[i]+" Constant is present at index 3,"+"Constant is : " +result);
			}
		}
	}
}
