import java.util.LinkedList;
import java.util.Scanner;
import java.util.Collections;

/**
 * @author Arushi
 * 
 */
public class CollectionSortedList {

	/**
	 * Class to add items in link list using java collections and then sorting
	 * it
	 */
	public static void main(String[] args) {
		LinkedList<Integer> sortLinkList = new LinkedList<Integer>();
		// sortLinkList is a link list of integer type
		Scanner sc = new Scanner(System.in);
		int choice;
		// Menu
		do {
			System.out.println("choose option");
			System.out.println("1.Add item");
			System.out.println("2.sort list display");
			do {// Validation

				while (!sc.hasNextInt()) {
					System.out
							.println("That's not a number!Please enter again");
					sc.next(); // this is important!
				}
				choice = sc.nextInt();
			} while (choice < 0);

			switch (choice) {

			case 1:// adding item in link list

				System.out.println("Enter item to add");
				int item;
				do {// Validation

					while (!sc.hasNextInt()) {
						System.out
								.println("That's not a number!Please enter again");
						sc.next(); // this is important!
					}
					item = sc.nextInt();
				} while (item < 0);
				sortLinkList.add(item);
				break;

			case 2:
				// Sorting elements using collection
				Collections.sort(sortLinkList);
				// showing sorted items using to string
				System.out.println("items are" + sortLinkList.toString());

				break;
			default:
				System.out.println("Choose correct value");

			}
			System.out.println("Choose 0  to continue");

			do {// Validation

				while (!sc.hasNextInt()) {
					System.out
							.println("That's not a number!Please enter again");
					sc.next(); // this is important!
				}
				choice = sc.nextInt();
			} while (choice < 0);

		} while (choice == 0);

		sc.close();

	}

}
