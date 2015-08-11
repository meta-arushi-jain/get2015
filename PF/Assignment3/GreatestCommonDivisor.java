import java.util.*;

/**
 * Assignment1.2
 * ---program to find greatest common divisor using recursion.
 * 
 * @author Arushi
 *
 */
public class GreatestCommonDivisor {

	public static void main(String[] args) {

		int temp;
		System.out.println("Enter nos to find gcd");
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		if ((input1 > 0) && (input2 > 0)) {
			if (input2 > input1) {
				temp = input2;
				input2 = input1;
				input1 = temp;

			}
			int greatestCommonDivisor = gcd(input1, input2);
			System.out.println("Greatest common divisor is"
					+ greatestCommonDivisor);
		}

		else {
			System.out
					.println("you have not submitted wrong value.Please put positive value");
		}

		sc.close();
	}

	/**
	 * Function details-----This function is accepting two positive integers and
	 * then calculating their greatest common divisor using recursion and then
	 * returning to the main function.
	 * 
	 * @param x
	 *            -----First input to be entered for finding greatest common
	 *            divisor.
	 * @param y
	 *            -----Second input to be entered for finding greatest common
	 *            divisor.
	 * @return------Returning greatest common divisor
	 */

	public static int gcd(int x, int y) {
		if (y == 0) {
			return x;
		} else {
			return gcd(y, (x % y));
		}
	}

}
