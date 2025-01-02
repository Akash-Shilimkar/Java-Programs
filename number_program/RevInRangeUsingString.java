package number_program;

public class RevInRangeUsingString {

public static void main(String[] args) {
	
	RevInRangeUsingString ref = new RevInRangeUsingString();
	int start = 100;
	int end = 300;
	for(;start<=end;start++)
	{
		System.out.println(ref.revNumber(start));
	}
	
}

public int revNumber(int a)
{
	String value = a+"";
	StringBuffer refv = new StringBuffer(value);
	String r1 = refv.reverse().toString();
	Integer ref = new Integer(r1);
	
	return ref.intValue();
}
}
