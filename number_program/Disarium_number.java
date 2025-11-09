import java.util.Scanner;

class Disarium_number{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int num = n;
        int num1 = n;
        int rem =0;
        int sum = 0;
        int c = 0;
        int len = c;

        while (num > 0)
        {
            c++;
            num /= 10;
            
        }
        while (n >0)
        {
            rem = n % 10;
            sum = sum + (rem * len);
            len--;
            n /=10;
        }

        if(sum == num1)
            System.out.println("Disarium Number.");
        else
            System.out.println("Not a Disarium Number.");
    }
}