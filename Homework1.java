// lumel17
/*
 Melinda Lu
 */

import java.awt.Rectangle;

public class Homework1 {

	/* Fix the error(s) in this method so that it runs properly
	 */
	public static int problem1() {
		int mystery = 1;
		mystery = mystery + 1;
		mystery = 1 - 2 * mystery;
		return mystery;
	}

	/* Construct and return a Rectangle that has a width of w and a
	 * height of h
	 */
	public static Rectangle problem2(int w, int h) {
			Rectangle rect = new Rectangle (50, 50, w, h);
			return rect;
	}

	/* Declare an integer, assign it a value of 5, then return it
	 */
	public static int problem3() {
			int x = 5;
			return x;

	}

	/* Declare and return a String containing the phrase "Computer Science"
	 */
	public static String problem4() {
			return "Computer Science";
	}

	/* Add 5 to num and return the new value
	 */
	public static int problem5(int num) {
			return num + 5;
	}

}
