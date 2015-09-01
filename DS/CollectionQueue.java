import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author Arushi
 * 
 */
public class CollectionQueue {

	/**
	 * class to implement queue using link list collection
	 */
	public static void main(String[] args) {
		LinkedList<Integer> queue = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		int choice;
		do {// Menu
			System.out.println("choose option");
			System.out.println("1.Add in queue");
			System.out.println("2.Delete from queue");
			System.out.println("3.Display front element");
			System.out.println("4.Display all element");
			do {// Validation

				while (!sc.hasNextInt()) {
					System.out
							.println("That's not a number!Please enter again");
					sc.next(); // this is important!
				}
				choice = sc.nextInt();
			} while (choice < 0);

			switch (choice) {
			case 1:
				System.out.println("enter item to add");
				// add item in queue
				int item;
				do {// Validation

					while (!sc.hasNextInt()) {
						System.out
								.println("That's not a number!Please enter again");
						sc.next(); // this is important!
					}
					item = sc.nextInt();
				} while (item < 0);
				queue.addLast(item);
				break;
			case 2:
				// display item and then delete it

				System.out.println("Item deleted is		" + queue.peekFirst());
				queue.pollFirst();

				break;
			case 3:
				// displaying front element
				System.out.println("item is  " + queue.peekFirst());
				break;
			case 4:
				// display the whole queue
				System.out.println("items are" + queue.toString());

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
