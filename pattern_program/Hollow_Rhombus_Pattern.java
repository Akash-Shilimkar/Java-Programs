package pattern_program;

public class Hollow_Rhombus_Pattern {

	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 4; k++) {
				if (i == 1 || i == 4 || k == 1 || k == 4) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
