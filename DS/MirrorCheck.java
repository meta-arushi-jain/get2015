import java.util.Scanner;

//Class to check if two trees are mirror images or not
/**
 * @author Arushi Main class for checking mirror trees
 *
 */
public class MirrorCheck {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int numberOfNodes;
		int elements;
		// Strings to store result of inorder traversal
		String result1 = "";
		String result2 = "";
		TreeOperations tree = new TreeOperations();
		TreeOperations tree1 = new TreeOperations();
		int element;
		// Entering values in first tree
		System.out.println("Enter 1st tree");
		System.out.println("Enter the number of nodes");
		do {// Validation

			while (!scan.hasNextInt()) {
				System.out.println("That's not a number!Please enter again");
				scan.next(); // this is important!
			}
			numberOfNodes = scan.nextInt();
		} while (numberOfNodes <= 0);

		System.out.println("Insert an element");
		do {// Validation

			while (!scan.hasNextInt()) {
				System.out.println("That's not a number!Please enter again");
				scan.next(); // this is important!
			}
			elements = scan.nextInt();
		} while (elements <= 0);

		Node root1 = new Node(elements);
		for (int i = 0; i < numberOfNodes - 1; i++) {
			System.out.println("Insert an element");
			do {// Validation

				while (!scan.hasNextInt()) {
					System.out
							.println("That's not a number!Please enter again");
					scan.next(); // this is important!
				}
				element = scan.nextInt();
			} while (element <= 0);

			tree.addForFirstTree(root1, element);
		}
		// Entering values in second tree
		System.out.println("Enter 2nd tree");
		System.out.println("Enter the number of nodes");
		do {// Validation

			while (!scan.hasNextInt()) {
				System.out.println("That's not a number!Please enter again");
				scan.next(); // this is important!
			}
			numberOfNodes = scan.nextInt();
		} while (numberOfNodes <= 0);

		System.out.println("Insert an element");
		do {// Validation

			while (!scan.hasNextInt()) {
				System.out.println("That's not a number!Please enter again");
				scan.next(); // this is important!
			}
			elements = scan.nextInt();
		} while (elements <= 0);

		Node root2 = new Node(elements);
		for (int i = 0; i < numberOfNodes - 1; i++) {
			System.out.println("Insert an element");
			do {// Validation

				while (!scan.hasNextInt()) {
					System.out
							.println("That's not a number!Please enter again");
					scan.next(); // this is important!
				}
				element = scan.nextInt();
			} while (element <= 0);

			tree1.addForSecondTree(root2, element);
		}
		// For storing result of inorder traversal
		result1 = tree.traverseInorder(root1);

		result2 = tree1.traverseInorder(root2);

		// reversing the string
		String reverse = new StringBuffer(result2).reverse().toString();

		if (result1.equals(reverse))
			System.out.println("mirror");
		else
			System.out.println("not mirror");

		scan.close();
	}
}
