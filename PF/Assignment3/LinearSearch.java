import java.util.*;

/**
 * Assignment2.1
 * ----Program to find the element using linear search recursively
 * 
 * @author Arushi
 *
 */
public class LinearSearch {

	public static void main(String[] args) {
		System.out.println("enter the size of array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		System.out.println("Enter values in the array");
		int[] inputArray = new int[size];
		for (int i = 0; i < size; i++) {
			inputArray[i] = sc.nextInt();
		}
		System.out.println("enter value to be found");
		int value = sc.nextInt();
		int index = 0;
		int result = linearSearch(inputArray, size, value, index);
		if (result == 0) {
			System.out.println("value not found");
		} else {
			System.out.println("no. is found at position" + result);
		}

		sc.close();

	}

	/**
	 * ----Function calls itself recursively so that it can trace all the values
	 * to find the desired element.
	 * 
	 * @param arr
	 *            ----array in which elements are stored
	 * @param length
	 *            ---length of array
	 * @param val
	 *            ----value to be found
	 * @param index
	 *            --at what position right now the index is.
	 */

	public static int linearSearch(int arr[], int length, int val, int index) {

		if (arr[index] == val) {
			int temp = index + 1;

			return temp;

		}

		if ((index == length - 1) && (arr[index] != val)) {
			int temp1 = 0;
			return temp1;

		}

		if (index < length - 1) {
			return linearSearch(arr, length, val, index + 1);

		} else {
			return 0;
		}

	}
}
