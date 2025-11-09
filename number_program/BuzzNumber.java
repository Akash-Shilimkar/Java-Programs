//W.A.P Java program to check whethere number is Buzz number.

import java.util.Scanner;

class BuzzNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int a = sc.nextInt();

        if(a%7==0 ||a%10==7)
        {
            System.out.println("Number is Buzz");
        }
        else
        {
            System.out.println("Number is not Buzz");
        }
    }
}