package number_Program;

public class RevInRange {
public static void main(String[] args) {

	RevInRange ref = new RevInRange();
	int start = 100;
	int end = 300;
	for(int i = start;i<=end;i++)
	{
		System.out.println(ref.revNumber(i));
	}
}
public int revNumber(int a)
{
	int rev=0;
	while(a>0)
	{
		int rem = a % 10;
		rev = rev*10+rem;
		a = a / 10;
	}
	return rev;
}
}
