/*10:Write a program to take a 2,3,4,5,6,... digit integer from the user and print sum of number and reverse of the number.
(ex= user given number=123 rev of number=321 result= 123+321).*/

import java.util.Scanner;

class Reverse_sum{
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    long a = sc.nextInt();
    long num = a;
    long b = 0;

    while(a > 0)
    {
        long rem = a %10;
        b = b * 10 + rem;
        a /= 10;
    }
    
    long c = b + num;
    System.out.println("User Given Number : "+num);
    System.out.println("Reverse Number : "+b);
    System.out.println("Sum of Both Number : "+c);
    }
}