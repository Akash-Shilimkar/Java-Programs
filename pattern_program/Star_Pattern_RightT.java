package pattern_program;

public class Star_Pattern_RightT {
	
	public static void main(String[] args) {
		
		for(int i = 0;i<=6;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}
