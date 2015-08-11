import java.util.*;

/**
 * Assignment2.2
 * Program to find element position in a sorted array using recursion
 * 
 * @author Arushi
 *
 */
public class BinarySearch {

	public static void main(String[] args) {
		int count = 0;

		System.out.println("Enter size of array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] inputArray = new int[size];
		System.out.println("Enter elements of array in sorted order");
		for (int i = 0; i < size; i++) {
			inputArray[i] = sc.nextInt();
		}
		System.out.println("Enter element to be found");
		int value = sc.nextInt();
		for (int i = 0; i < size - 1; i++) {
			if (inputArray[i] > inputArray[i + 1]) {
				count = -1;
				break;
			}
		}
		if (count == -1) {
			System.out.println("Please enter sorted values");

		} else {

			int result = recursiveBinarySearch(inputArray, 0, size, value);
			if (result == -1) {
				System.out.println("element not found");
			} else {
				result = result + 1;
				System.out.println("element found at position" + result);
			}
		}

		sc.close();

	}

	/**
	 * Program which takes input array and find the position at which the
	 * element resides which we want to find
	 * 
	 * @param sortedArray
	 *            -Sorted Array
	 * @param start
	 *            -index of array at which it start
	 * @param end
	 *            -index at which it ends.
	 * @param key
	 *            -value to be found
	 * @return-the position of element
	 */
	public static int recursiveBinarySearch(int[] sortedArray, int start,
			int end, int key) {

		if (start < end) {
			int mid = start + (end - start) / 2;
			if (key < sortedArray[mid]) {
				return recursiveBinarySearch(sortedArray, start, mid, key);

			} else if (key > sortedArray[mid]) {
				return recursiveBinarySearch(sortedArray, mid + 1, end, key);

			} else {
				return mid;
			}
		} else {
			return -1;
		}
	}

}
