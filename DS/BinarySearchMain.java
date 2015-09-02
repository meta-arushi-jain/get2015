import java.util.*;

/**
 * @author Arushi----Main class to perform all operations
 *
 */
public class BinarySearchMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("Enter no of elements");
		// taking no of elements from user
		while (!sc.hasNextInt()) {
			System.out.println("Please Enter a number only");
			sc.next();
		}
		int elements = sc.nextInt();
		int pos = 0;
		int inputArray[] = new int[elements];
		System.out.println("enter elements");
		// storing elements in array
		for (int i = 0; i < elements; i++) {
			while (!sc.hasNextInt()) {
				System.out.println("Please Enter a number only");
				sc.next();
			}
			inputArray[i] = sc.nextInt();
		}
		// sorting array
		Arrays.sort(inputArray);
		// displaying sorted array
		for (int i = 0; i < inputArray.length; i++)
			System.out.println(inputArray[i]);
		do {

			System.out.println("Enter item to search");
			while (!sc.hasNextInt()) {
				System.out.println("Please Enter a number only");
				sc.next();
			}
			int item = sc.nextInt();

			System.out.println("Choose one");
			System.out.println("1.Leftmost Occurence");
			System.out.println("2.RightMost Occurence");
			BinarySearchOperation binarySearch = new BinarySearchOperation();
			while (!sc.hasNextInt()) {
				System.out.println("Please Enter a number only");
				sc.next();
			}
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				// first searching element in array
				pos = binarySearch.binarySearch(inputArray, 0, elements - 1,
						item);
				if (pos == -1) {
					System.out.println("Not found the item");
					break;
				}
				// to check leftmost occurrence
				pos = binarySearch.getLeftMostOccurence(inputArray, 0, pos,
						item);
				 
					System.out.println("Position is" + pos);
				
				break;

			case 2:
				// first searching element in array
				pos = binarySearch.binarySearch(inputArray, 0, elements - 1,
						item);
				if (pos == -1) {
					System.out.println("Not found");
					break;
				}
				// to check rightmost occurrence
				pos = binarySearch.getRightMostOccurence(inputArray, pos,
						elements, item);

				 
					System.out.println("Position is" + pos);
				
				break;
			default:
				System.out.println("Enter right values");

			}
			System.out
					.println("\nDo you want to continue (Type y to continue) \n");

			choice = sc.next().charAt(0);
		} while (choice == 'Y' || choice == 'y');
		sc.close();

	}

}
