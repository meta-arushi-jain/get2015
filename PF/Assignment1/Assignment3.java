
import java.util.Scanner;

public class Assignment3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int noOfElements, i;
		
		int longestSubsequence[] = new int[20];

		System.out.println("enterno.of elements");
		Scanner sc = new Scanner(System.in);

		noOfElements = sc.nextInt();
		int repeatedArray[] = new int[noOfElements];
		System.out.println(" nos" + noOfElements);
		System.out.println("enter nos");
		for (i = 0; i < noOfElements; i++) {

			repeatedArray[i] = sc.nextInt();
		}
		
		
		longestSubsequence = longestSequence(repeatedArray);
		for (i = 0; i < longestSubsequence.length; i++) {
			System.out.println("" + longestSubsequence[i]);
		}

	}

	public static int[] longestSequence(int[] arr) {
		int init = 0, fin = 0, j = 0, k = 1, count = 1, maxCount = 1, temp = 0, m = 0;
		
		while (k < arr.length - 1) {
			temp = j;
			while (arr[j] < arr[k]) {
				
				count = count + 1;
				j = j + 1;
				k = k + 1;
			}
			if (maxCount < count) {
				maxCount = count;
				fin = k;
				init = temp;
				j = j + 2;
				k = k + 2;
				

			}
		}
		int seqArray[] = new int[maxCount];
		for (int i = init; i < fin; i++) {
			seqArray[m] = arr[i];
			m = m + 1;
		}
		return seqArray;

	}
}
