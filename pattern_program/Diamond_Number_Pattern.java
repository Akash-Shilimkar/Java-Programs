package pattern_program;

public class Diamond_Number_Pattern {

	public static void main(String[] args) {
		int a = 1;
		int j;
		for (int i = 1; i < 4; i++) {
			for (j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			for (j = 1; j <= i; j++) {
				System.out.print(a + " ");
				a++;
			}
			System.out.println();
		}
		for (int i = 1; i < 5; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (j = 4; j >= i; j--) {
				System.out.print(a + " ");
				a++;
			}
			System.out.println();
		}
	}
}
