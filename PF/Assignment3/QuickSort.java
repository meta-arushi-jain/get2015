import java.util.*;

public class QuickSort {

	/**
	 * Assignment3
	 * Program to implement quick sort recursively
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int size, i;
		System.out.println("Enter number of integer elements");
		size = sc.nextInt();
		if (size == 0) {
			System.out.println("no should be greater than 0");
		} else {

			int inputArr[] = new int[size];
			int finalArr[] = new int[size];

			System.out.println("\nEnter integer elements");
			for (i = 0; i < size; i++) {
				inputArr[i] = sc.nextInt();
			}

			finalArr = sortArray(inputArr, 0, size - 1);

			System.out.println("\nElements after sorting ");
			for (i = 0; i < size; i++) {
				System.out.print(finalArr[i] + " ");
				System.out.println();
			}
		}
		sc.close();

	}

	/**
	 * Function calls recursive sort array
	 * 
	 * @param arr
	 *            -input array
	 * @param low
	 *            --lower index
	 * @param high
	 *            --higher index
	 * @return--sorted array
	 */
	public static int[] sortArray(int arr[], int low, int high) {
		if ((low == 0) && (high == 0)) {
			return arr;
		} else
			quickSort(arr, low, high);
		return arr;
	}

	/**
	 * Function status-->dividing array into parts before mid value and after
	 * mid value as before mid it contains smaller values than mid and after it
	 * contains greater values.
	 * 
	 * @param arr
	 *            --->input array
	 * @param low
	 *            --->lower bound
	 * @param high
	 *            --->upper bound
	 * @return----->sorted array
	 */
	public static void quickSort(int arr[], int low, int high) {
		int i = low, j = high;
		int temp;
		int mid = arr[(low + high) / 2];
		int midptr = (low + high) / 2;

		while (i <= j) {
			while ((i < midptr) && (arr[i] < mid))
				i++;
			while ((j > midptr) && (arr[j] > mid))
				j--;
			if (i <= j) {

				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;

				i++;
				j--;
			}
		}
		if (low < j) {
			quickSort(arr, low, j);
		}

		if (i < high) {
			quickSort(arr, i, high);
		}
	}

}
