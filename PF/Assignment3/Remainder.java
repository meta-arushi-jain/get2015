import java.util.*;

/**
 * Assignment1.1
 * @author Arushi
 *
 */
public class Remainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the no.s which you want to divide");
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		int remainder = rem(input1, input2);
		System.out.println("remainder is" + remainder);

		sc.close();

	}

	/**
	 * Function Process---the function calls itself recursively such that we can
	 * find remainder.It also checks for the boundary condition as per given in
	 * the question.
	 * 
	 * @param x
	 *            -----dividend
	 * @param y
	 *            -----divisor
	 * @return------remainder
	 * 
	 */

	public static int rem(int x, int y) {
		if (y <= 0) {
			return -1;
		}

		if (x < 0) {
			return -1;
		}

		if (y > x) {
			return x;
		}

		else {

			return rem((x - y), y);
		}

	}

}
