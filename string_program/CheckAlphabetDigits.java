package string_program;

import java.util.*;
import java.lang.*;

public class CheckAlphabetDigits{
  public static void main (String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String : ");
    String str = sc.nextLine();
    char ch = ' ';
    int alphabet = 0;
    int digit  = 0;
    int schar = 0;
    for(int i = 0;i < str.length();i++){
      ch = str.charAt(i);
      if(Character.isLetter(ch)){
        alphabet++;
      } else if(Character.isDigit(ch)){
        digit++;
      } else {
        schar++;
      }
    }
    System.out.println("Total Alphabet in string is : "+alphabet);
    System.out.println("Total Digit in string is : "+digit);
    System.out.println("Total Special Character in string is : "+schar);
  }
}
