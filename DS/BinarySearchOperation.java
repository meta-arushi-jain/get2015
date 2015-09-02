/**
 * @author Arushi--- Class to perform all binary search operations
 *
 */
public class BinarySearchOperation {

	/**
	 * Function to perform binary search
	 * 
	 * @param inputArray
	 *            ---Array from which element to be search
	 * @param left
	 *            ----leftmost index from we have to start search
	 * @param right
	 *            ---rightmost index up to which we have to search
	 * @param key
	 *            ---- item to search
	 * @return----index where item is
	 */
	int binarySearch(int inputArray[], int left, int right, int key) {
		int mid;
		// Loop invariant:
		// 1---left is always less than or equal to right
		// 2----If element at mid = key,then return
		while (left <= right) {
			mid = left + (right - left) / 2;

			if (inputArray[mid] == key) // first comparison
				return mid;

			if (inputArray[mid] < key) // second comparison
				left = mid + 1;
			else
				right = mid - 1;
		}

		return -1;
	}

	/**
	 * Checking for the right most occurrence
	 * 
	 * @param inputArray
	 *            ---Array from which element to be search
	 * @param left
	 *            ----leftmost index from we have to start search
	 * @param right
	 *            ---rightmost index up to which we have to search
	 * @param key
	 *            ---- item to search
	 * @return---index where item is at right most
	 */
	int getRightMostOccurence(int inputArray[], int left, int right, int key) {
		int mid;
		// Loop Invariant---
		// 1----right index-left index will always be greater than one

		while (right - left > 1) {

			mid = left + (right - left) / 2;

			if (inputArray[mid] <= key)
				left = mid;
			else
				right = mid;

		}

		return left;
	}

	/**
	 * -----Function to check for left most occurrence
	 * 
	 * @param inputArray
	 *            ---Array from which element to be search
	 * @param left
	 *            ----leftmost index from we have to start search
	 * @param right
	 *            ---rightmost index up to which we have to search
	 * @param key
	 *            ---- item to search
	 * @return---index where item is at left most
	 */
	int getLeftMostOccurence(int inputArray[], int left, int right, int key) {
		int mid;
		// Loop Invariant---
		// 1----right index-left index will always be greater than or equal to
		// one
		while ((right - left >= 1)) {
			
			mid = left + (right - left) / 2;

			if (inputArray[mid] >= key)
				right = mid;
			else
				left = mid;
			if(mid==0){
				return right;
			}
		}

		return right;
	}

}
