import java.util.Scanner;

/**
 * @author Arushi Main class for traversing
 *
 */
public class SortTreeMain {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		char mainChoice;
		Utility utility = new Utility();

		do {
			int numberOfNodes;
			String result1 = "";
			TreeOperations tree = new TreeOperations();
			int element;
			// Entering values in tree
			Node root1 = null;

			// Asking for no of students
			System.out.println("Enter the number of students");

			numberOfNodes = utility.checkingInteger();
			// entering nos
			int isContain;
			System.out.println("Insert an element");

			element = utility.checkingInteger();

			root1 = tree.addInTree(root1, element);
			tree.studentList.add(element);
			for (int i = 0; i < numberOfNodes - 1; i++) {
				System.out.println("Insert an element");

				element = utility.checkingInteger();
				// checking for element if present
				isContain = tree.contains(element);

				if (isContain == 0) {

					root1 = tree.addInTree(root1, element);
					tree.studentList.add(element);
				} else {
					System.out.println("Element is already in list.try again");
					i = i - 1;

				}
			}
			// For storing result of inorder traversal
			result1 = tree.traverseInorder(root1);
			// printing the result
			System.out.println("Inputs are" + result1);

			mainChoice = utility.checkingString();
		} while (mainChoice == 'Y');
		scan.close();

	}

}
