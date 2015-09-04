
/**
 * @author Arushi----Main Class for Sort System
 *
 */
public class SortSystemMain {

	public static void main(String[] args) {
		int choice;
		char mainChoice;

		MenuClass menuClass = new MenuClass();
		Utility utility = new Utility();
		SortSystemOperations sortOperations = new SortSystemOperations();

		do {// entering elements
			int size, i;
			System.out.println("Enter number of integer elements");
			size = utility.checkingInteger();

			int inputArr[] = new int[size];
			int finalArr[] = new int[size];

			System.out.println("\nEnter integer elements");
			for (i = 0; i < size; i++) {
				inputArr[i] = utility.checkingInteger();
			}

			// Menu
			menuClass.showMenuForSorting();

			choice = utility.checkingInteger();
			while (choice != 1 && choice != 2) {
				System.out.println("enter again");
				choice = utility.checkingInteger();
			}
			switch (choice) {
			// checking all cases
			case 1:
				finalArr = sortOperations.comparisonSorting(size, finalArr,
						inputArr);
				break;
			case 2:
				finalArr = sortOperations.linearSorting(finalArr, inputArr);
				break;
			default:
				System.out.println("Enter correct choice");
				break;
			}
			// printing elements
			System.out.println("\nElements after sorting ");
			for (i = 0; i < size; i++) {
				System.out.print(finalArr[i] + " ");
				System.out.println();
			}

			mainChoice = utility.checkingString();

		} while (mainChoice == 'Y');

	}

}

