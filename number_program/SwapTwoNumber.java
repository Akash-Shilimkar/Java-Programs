package number_program;

import java.util.*;

publi class SwapTwoNumber{
  public static void main(String args[]){
    Scanner sc = new Scanner(Sytem.in);
    System.out.println("Enter a number : ");
    int a = sc.nextInt();
    System.out.println("Enter a number : ");
    int b = sc.nextInt();

    a = a + b;
    b = a - b;
    a = a - b;

  System.out.println("Number after swap : " + a " " + b);
