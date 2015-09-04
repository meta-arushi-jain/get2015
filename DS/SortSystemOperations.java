/**
 * @author Arushi----Class to perform all operations regarding sort system
 *
 */
public class SortSystemOperations {

	/**
	 * Function for selecting type of comparison sorting
	 * 
	 * @param noOfElements
	 *            -----total no of elements
	 * @param finalArr
	 *            ----outputArray
	 * @param inputArr
	 *            ----input array
	 * @return-----final array
	 */
	public int[] comparisonSorting(int noOfElements, int[] finalArr,
			int[] inputArr) {
		if (noOfElements <= 10) {
			System.out.println("Sorting by bubble sort-----");
			finalArr = bubbleSort(inputArr);

		} else {
			System.out.println("Sorting by quick sort-----");
			finalArr = quickSort(inputArr, 0, inputArr.length - 1);

		}
		return finalArr;

	}

	/**
	 * Function for selecting type of linear sorting
	 * 
	 * @param finalArr
	 *            ---final output array
	 * @param inputArr
	 *            ---inputArray
	 * @return----final Array
	 */
	public int[] linearSorting(int[] finalArr, int[] inputArr) {

		int max = 0;

		for (int i = 0; i < inputArr.length; i++) {
			if (inputArr[i] > max)
				max = inputArr[i];

		}

		if (max > 20) {
			System.out.println("Sorting by radix sort-----");
			finalArr = radixSort(inputArr);
		} else {
			System.out.println("Sorting by counting sort-----");
			finalArr = countingSort(inputArr);
		}

		return finalArr;
	}

	/**
	 * Function for quick sort
	 * 
	 * @param arr
	 *            ---input array
	 * @param low
	 *            ----lower bound
	 * @param high
	 *            ---upper bound
	 * @return----final output array
	 */
	public int[] quickSort(int arr[], int low, int high) {

		int i = low;
		int k = high;
		// setting the pivot element at its right position
		if (high - low >= 1)

		{
			int pivot = arr[low];

			while (k > i)

			{
				while (arr[i] <= pivot && i <= high && k > i)

					i++;
				while (arr[k] > pivot && k >= low && k >= i)

					k--;
				if (k > i) {
					int temp = arr[i];
					arr[i] = arr[k];
					arr[k] = temp;

				}
			}
			int temp = arr[low];
			arr[low] = arr[k];
			arr[k] = temp;

			quickSort(arr, low, k - 1); // quicksort the left partition
			quickSort(arr, k + 1, high); // quicksort the right partition
		} else

		{
			return arr; // the array is sorted, so exit
		}
		return arr;
	}

	/**
	 * Function to solve using bubble sort
	 * 
	 * @param arr
	 *            ---input array
	 * @return----final output array
	 */
	public int[] bubbleSort(int arr[]) {

		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;

	}

	/**
	 * Function for counting sort
	 * 
	 * @param arr
	 *            ---array to sort
	 * @return----sorted array via counting sort
	 */
	public int[] countingSort(int[] arr) {
		int N = arr.length;
		if (N == 0)
			return arr;
		/** find max and min values **/
		int max = arr[0], min = arr[0];
		for (int i = 0; i < N; i++) {
			if (arr[i] > max)
				max = arr[i];

			if (arr[i] < min)
				min = arr[i];
		}

		int range = max - min;

		int[] count = new int[range + 1];
		/** make count/frequency array for each element **/
		for (int i = 0; i < N; i++) {
			count[arr[i] - min] = count[arr[i] - min] + 1;
		}

		/** modify count so that positions in final array is obtained **/
		for (int i = 1; i < range + 1; i++) {
			count[i] += count[i - 1];
		}
		/** modify original array **/
		int j = 0;
		for (int i = 0; i < range + 1; i++) {
			while (j < count[i]) {
				arr[j++] = i + min;
			}
		}

		return arr;

	}

	/**
	 * Function to return index so that element can be inserted at right
	 * position in bucket for radix sort
	 * 
	 * @param element
	 *            ----element to be inserted
	 * @param traversal
	 *            ----up to which stage loop is to be traverse
	 * @return----index position
	 */
	public int returnIndex(int element, int traversal) {
		int index = 0;
		for (int i = 1; i <= traversal; i++) {
			index = element % 10;
			element = element / 10;

		}
		return index;
	}

	/**
	 * Function to sort using Radix sort
	 * 
	 * @param arr
	 *            ---input array
	 * @return----final output array
	 */
	public int[] radixSort(int arr[]) {
		int max = 0, count = 0;
		int indexCounter[] = new int[10];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];

		}
		while (max != 0) {
			max = max / 10;
			count++;

		}
		int bucket[][] = new int[10][arr.length];
		int loopTraversal = 1;
		while (loopTraversal <= count) {
			for (int i = 0; i < arr.length; i++) {
				int index = returnIndex(arr[i], loopTraversal);

				bucket[index][indexCounter[index]] = arr[i];
				indexCounter[index]++;

			}

			int k = 0;
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < indexCounter[i]; j++) {
					arr[k] = bucket[i][j];
					k++;
				}
			}
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < indexCounter[i]; j++) {
					bucket[i][j] = 0;
				}
				indexCounter[i] = 0;
			}

			loopTraversal++;
		}

		return arr;

	}

}
