import java.util.*;

/**
 * Assignment1.3 -----Program to find the largest digit in the given no.
 * 
 * @author Arushi
 *
 */
public class LargestDigit {

	public static void main(String[] args) {

		System.out.println("Enter the no ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if (number >= 0) {
			LargestDigit digit = new LargestDigit();
			int largestValue = digit.largestDigit(number);
			System.out.println("Largest Digit in this no is" + largestValue);
		}

		else {
			System.out.println("Please enter the positive value");
		}

		sc.close();

	}

	/**
	 * Function process-----It checks for each digit from last recursively and
	 * if it is greater then previous one it will update the holder.
	 * 
	 * @param x
	 *            ------storing the value for which we have to check the largest
	 *            digit
	 * @return-------Largest digit.
	 * 
	 * @return
	 */
	public int largestDigit(int x) {

		if (x == 0) {
			return 0;
		}

		else
			return (maxvalue(x % 10, largestDigit(x / 10)));

	}

	public static int maxvalue(int x, int y) {
		if (x > y) {
			return x;
		} else {
			return y;
		}
	}

}
