//8: Write a program to print reverse tables of n . (n is user input).

import java.util.Scanner;

class Reverse_Table{
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int a = sc.nextInt();

    for(int i=a;i<=10;i++)
    {
        int b = a * i;
        while(b>0)
        {
            int rem = b % 10;
            b = b *10+rem;
        }
        System.out.println(b);
    }
    }
}