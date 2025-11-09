import java.util.Scanner;

class Magic_Number{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int num = n;
        int rem =0;
        int sum = 0;

        while(num > 9)
        {
            while(num > 0)
            {
                rem = num % 10;
                sum += rem;
                num /=10;
            }
            num = sum;
            sum = 0;
        }
        if (num == 1)
        {
            System.out.println("Magic Number");
        }
        else
        {
            System.out.println("Not Magic Number");
        }
    }
}