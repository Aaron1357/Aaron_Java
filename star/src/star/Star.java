package star;

import java.util.*;

public class Star {

	public static void main(String[] args) {

		/*
		 * for (int i = 0; i < 1; i++) { System.out.println("       *      "); // 6
		 * System.out.println("      ***      "); // 5 6 7
		 * System.out.println("     *****      "); // 4 5 6 7 8
		 * System.out.println("    *******      "); // 3 4 5 6 7 8 9
		 * System.out.println("   ***************      "); // 2 3 4 5 6 7 8 9 10
		 * System.out.println("  *****     "); // 1 2 3 4 5 6 7 8 9 10 11
		 * System.out.println("   *********      "); // 2 3 4 5 6 7 8 9 10
		 * System.out.println("    *******      "); // 3 4 5 6 7 8 9
		 * System.out.println("     *****      "); // 4 5 6 7 8
		 * System.out.println("      ***      "); // 5 6 7
		 * System.out.println("       *      "); // 6
		 * 
		 * }
		 */
		int star = 7;
		for (int i = 0; i < 11; i++) {
			for (int j = 0; j < 11; j++) {
				if (j == star) {
					System.out.print("*");
					star = star - i;
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
			
			

		}

		int star2 = 7;
	for (int i = 0; i < 11; i++) {
		for (int j = 0; j < 11; j++) {
			if (j == star) {
				System.out.print("*");
				star = star + i;
			} else {
				System.out.print(" ");
			}
		}
		System.out.println();
}
	}
}