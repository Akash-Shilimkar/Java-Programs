package pattern_program;

public class DownWard_Triangle_Pattern {

	public static void main(String[] args){
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=5-i;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println( );
        }
    }
}
