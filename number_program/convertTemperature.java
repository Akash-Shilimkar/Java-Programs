import java.util.*;

class convertTemperature
{
public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the kelvin : ");
        double a = sc.nextDouble();

        double celcius = a - 273/100;

        double farenhait = (1.8*a-273*1.8)+32;

        System.out.println("Temperature in kevin : "+a);
        System.out.println("Temperature in Celcius : "+celcius);
        System.out.println("Temperature in Farenhit : "+farenhait);
        
    }
}