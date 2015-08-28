import java.util.Scanner;

/**
 * @author Arushi Main class for traversing
 *
 */
public class TraverseBinary {
	public static void main(String arg[]) {
		int totalNumber;
		int choice;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("enter total number of values");
			do {// Validation

				while (!scan.hasNextInt()) {
					System.out
							.println("That's not a number!Please enter again");
					scan.next(); // this is important!
				}
				totalNumber = scan.nextInt();
			} while (totalNumber <= 0);

			System.out.println("enter values");
			int value;
			do {// Validation

				while (!scan.hasNextInt()) {
					System.out
							.println("That's not a number!Please enter again");
					scan.next(); // this is important!
				}
				value = scan.nextInt();
			} while (value <= 0);

			BinaryTree tree = new BinaryTree(value);
			for (int i = 1; i < totalNumber; i++) {
				do {// Validation

					while (!scan.hasNextInt()) {
						System.out
								.println("That's not a number!Please enter again");
						scan.next(); // this is important!
					}
					value = scan.nextInt();
				} while (value <= 0);

				tree.addNode(value);
			}

			System.out
					.println("enter value 1 for Pre-order traversal, 2 for Post-order traversal");
			do {// Validation

				while (!scan.hasNextInt()) {
					System.out
							.println("That's not a number!Please enter again");
					scan.next(); // this is important!
				}
				choice = scan.nextInt();
			} while (choice <= 0);

			if (choice == 1) {
				tree.traversePreOrder();
			}

			else if (choice == 2) {
				tree.traversePostOrder();
			}

			else {
				System.out.println("invalid input");
			}
			System.out.println("Press 0 if you want to continue");
			do {// Validation

				while (!scan.hasNextInt()) {
					System.out
							.println("That's not a number!Please enter again");
					scan.next(); // this is important!
				}
				choice = scan.nextInt();
			} while (choice <= 0);

		} while (choice == 0);

		scan.close();

	}

}
