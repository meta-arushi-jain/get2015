import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * @author Arushi----Class to implement all operations
 *
 */
public class SortedListFunctions {
	private Scanner scan = new Scanner(System.in);
	private int index = 0;

	/**
	 * Function to add elements
	 * 
	 * @param element
	 *            ----element to add
	 * @param list
	 *            -----list in which we have to add
	 */
	public void insert(int element, List<Integer> list) {
		if (index == list.size()) {
			list.add(element);
			index = 0;
		} else if ((int) list.get(index) < element) {
			index = index + 1;
			insert(element, list);
		} else {
			list.add(index, element);
			index = 0;
		}

	}

	/**
	 * Function to display all elements
	 * 
	 * @param list
	 *            ----list to display
	 */
	public void display(List<Integer> list) {
		Iterator<Integer> iterator = list.iterator();
		System.out.println("Elements are :");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	/**
	 * checking input is integer or not
	 * 
	 * @param value
	 *            :value to get
	 * @return :an integer value
	 */
	public int checkingInteger(int value) {

		do {// Validation

			while (!scan.hasNextInt()) {
				System.out.println("That's not a number!Please enter again");
				scan.next(); // this is important!
			}
			value = scan.nextInt();
		} while (value <= 0);
		return value;
	}

	/**
	 * checking input is String or not
	 * 
	 * @param value
	 *            :value to get
	 * @return :return a char value
	 */
	public char checkingString(char value) {

		do {// validation
			System.out.println("Do you want to continue ?(Y/N)"); // continuing
			// the
			// procedure
			while (!scan.hasNext()) {
				System.out.println("That's not a character!");
				scan.next(); // this is important!

			}
			value = scan.next().toUpperCase().charAt(0);
			if (value == 'N')
				break;
		} while (value != 'Y');
		return value;
	}
}
