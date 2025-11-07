package string_program;

import java.util.*;

public class Angrams {
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the String : ");
		 String str = sc.nextLine();
     System.out.println("Enter the String : ");
		 String str1 = sc.nextLine();

     char s1 [] = str.toCharArray();
     char s2[] = str1.toCharArray();
     Arrays.sort(s1);
     Arrays.sort(s2);
    
     if(Arrays.equals(s1,s2)){
       System.out.println("Anagrams");
     } else {
       System.out.println("Not Anagrams");
     }
  }
}

