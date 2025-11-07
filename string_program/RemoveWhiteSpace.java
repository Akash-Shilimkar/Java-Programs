package string_program;

import java.util.*;

public class RemoveWhiteSpace{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String :");
    String str = sc.nextLine();
    String newStr = " ";

    newStr = str.replaceAll("\\s+","");
    System.out.println(newStr);
  }
}

