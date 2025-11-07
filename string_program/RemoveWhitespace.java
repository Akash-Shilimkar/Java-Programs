package string_program;

import java.util.*;

public class RemoveWhitespace{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string : ");
    String str = sc.nextLine();
    String newStr = str.trim().replaceAll("\\s+"," ");
    System.out.println(newStr);
  }
}
