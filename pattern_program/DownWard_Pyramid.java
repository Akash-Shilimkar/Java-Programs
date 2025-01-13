package pattern_program;

public class DownWard_Pyramid {

	public static void main(String[] args) {
		int j;
		for (int i = 1; i <= 4; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (j = 4; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
