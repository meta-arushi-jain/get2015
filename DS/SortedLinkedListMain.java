
import java.util.LinkedList;

import java.util.List;
import java.util.Scanner;

/**
 * @author Arushi---Main class to implement sorting
 *
 */
public class SortedLinkedListMain {

	public static void main(String args[]) {
		int choice = 0, number = 0, size = 0, element = 0;
		char mainChoice = 0;
		Scanner scan = new Scanner(System.in);
		List<Integer> linkedList = new LinkedList<Integer>();
		SortedListFunctions operation = new SortedListFunctions();
		// Adding initial list
		System.out.println("Enter number of elements to be added");

		size = operation.checkingInteger(size);
		System.out.println("Enter elements to add");
		for (int i = 0; i < size; i++) {
			element = operation.checkingInteger(element);
			linkedList.add(element);
		}
		linkedList.sort(null);
		do {// Menu
			System.out
					.println("Enter 1 to insert an element in Sorted Linked List "
							+ "\n2 Display the linked list");
			choice = operation.checkingInteger(choice);
			switch (choice) {
			case 1:// to insert
				System.out.println("Enter Integer Number to insert :");
				number = operation.checkingInteger(number);
				operation.insert(number, linkedList);
				break;
			case 2:// display
				System.out.println("Linked List is: ");
				operation.display(linkedList);
				break;
			default:
				System.out.println("Enter Correct Choice");
			}
			mainChoice = operation.checkingString(mainChoice);
		} while (mainChoice == 'Y');
		scan.close();
	}

}
