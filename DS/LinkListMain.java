import java.util.Scanner;

/**
 * @author Arushi----It is a main class to perform operation of link list
 *
 */
public class LinkListMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/* Creating object of class linkedList */
		LinkListOperation linklist = new LinkListOperation();

		char ch;
		/* Perform list operations */
		do {
			System.out.println("\nSingly Linked List Operations\n");
			System.out.println("1. Create link list");

			System.out.println("2. insert at position");
			System.out.println("3. delete at position");

			System.out.println("4. get size");
			System.out.println("5. display");
			System.out.println("6.delete by value");
			System.out.println("7.reverse linklist");
			System.out.println("8.sort linklist");
			System.out.println("9.retrive element at position");

			int choice;
			int element;
			do {// Validation

				while (!scan.hasNextInt()) {
					System.out
							.println("That's not a number!Please enter again");
					scan.next(); // this is important!
				}
				choice = scan.nextInt();
			} while (choice <= 0);
			switch (choice) {
			case 1:
				System.out.println("Enter integer element to insert");
				do {// Validation

					while (!scan.hasNextInt()) {
						System.out
								.println("That's not a number!Please enter again");
						scan.next(); // this is important!
					}
					element = scan.nextInt();
				} while (element <= 0);

				linklist.createLinkList(element);
				break;

			case 2:
				System.out.println("Enter integer element to insert");
				int num;
				do {// Validation

					while (!scan.hasNextInt()) {
						System.out
								.println("That's not a number!Please enter again");
						scan.next(); // this is important!
					}
					num = scan.nextInt();
				} while (num < 0);

				System.out.println("Enter position");
				int pos;
				do {// Validation

					while (!scan.hasNextInt()) {
						System.out
								.println("That's not a number!Please enter again");
						scan.next(); // this is important!
					}
					pos = scan.nextInt();
				} while (pos <= 0);

				if (pos < 1 || pos > linklist.getSize())
					System.out.println("Invalid position\n");
				else
					linklist.insertAtPos(num, pos);
				break;
			case 3:
				System.out.println("Enter position");
				int position;
				do {// Validation

					while (!scan.hasNextInt()) {
						System.out
								.println("That's not a number!Please enter again");
						scan.next(); // this is important!
					}
					position = scan.nextInt();
				} while (position <= 0);

				if (position < 1 || position > linklist.getSize())
					System.out.println("Invalid position\n");
				else
					linklist.deleteAtPos(position);
				break;

			case 4:
				System.out.println("Size = " + linklist.getSize() + " \n");
				break;
			case 5:
				/* Display List */
				linklist.display();
				break;
			case 6:
				System.out.println("enter value");
				int val;
				do {// Validation

					while (!scan.hasNextInt()) {
						System.out
								.println("That's not a number!Please enter again");
						scan.next(); // this is important!
					}
					val = scan.nextInt();
				} while (val < 0);
				linklist.removeElement(val);
				break;
			case 7:
				linklist.reverse();
				break;
			case 8:
				linklist.sort();
				break;
			case 9:
				System.out.println("enter value");
				int index;
				do {// Validation

					while (!scan.hasNextInt()) {
						System.out
								.println("That's not a number!Please enter again");
						scan.next(); // this is important!
					}
					index = scan.nextInt();
				} while (index < 0);

				linklist.retrieveAtPosition(index);
				break;
			default:
				System.out.println("Wrong Entry \n ");
				break;
			}

			System.out.println("\nDo you want to continue (Type y or n) \n");
			ch = scan.next().charAt(0);
		} while (ch == 'Y' || ch == 'y');
		scan.close();
	}

}
