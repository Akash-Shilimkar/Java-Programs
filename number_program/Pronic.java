import java.util.*;
class Pronic
{
    public static void main(String[] args)
    {
       for(int a=8;a<=100;a++)
       {

        for(int i =1,j=i+1;i<a;i++,j++)
        {
            if (i*j==a)
            {
                System.out.println(i + "x" +j+"="+a);
            }
        }  
       }    
    }
}