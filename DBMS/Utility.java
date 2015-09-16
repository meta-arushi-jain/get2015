import java.util.Scanner;

/**
 * @author Arushi class implementation of validations
 *
 */
public class Utility {
	private Scanner scanner = new Scanner(System.in);

	/**
	 * checking input is integer or not
	 * 
	 * @param value
	 *            :value to get
	 * @return :an integer value
	 */
	public int checkingInteger() {
		int value;
		do {// Validation

			while (!scanner.hasNextInt()) {
				System.out.println("That's not a number!Please enter again");
				scanner.next();
			}
			value = scanner.nextInt();
		} while (value < 0);
		return value;
	}

	/**
	 * checking input is String or not
	 * 
	 * @param value
	 *            :value to get
	 * @return :return a char value
	 */
	public char checkingPersonType() {
		char value;
		do {// validation
			while (!scanner.hasNext()) {
				System.out.println("That's not a character!");
				scanner.next();

			}
			value = scanner.next().toUpperCase().charAt(0);
			if (value == 'P' || value == 'S' || value == 'O')
				break;
		} while (value != 'P' || value != 'S' || value != 'O');
		return value;
	}

	/**
	 * checking input is String or not
	 * 
	 * @param value
	 *            :value to get
	 * @return :return a char value
	 */
	public char checkingCategory() {
		char value;
		do {// validation
			System.out.println("Enter Correct value");
			while (!scanner.hasNext()) {
				System.out.println("That's not a character!");
				scanner.next();

			}
			value = scanner.nextLine().toUpperCase().charAt(0);
			if (value == 'F' || value == 'M') {
				break;
			}
		} while (value != 'F' || value != 'M');
		return value;
	}

	/**
	 * checking input is integer or not
	 * 
	 * @param value
	 *            :value to get
	 * @return :an integer value
	 */
	public int checkingChoice() {
		int value;
		do {// Validation

			while (!scanner.hasNextInt()) {
				System.out.println("That's not a number!Please enter again");
				scanner.next();
			}
			value = scanner.nextInt();
			if (value != 1 && value != 2 && value != 3) {
				value = -1;
				System.out.println("Enter Correct Choice");
			}
		} while (value < 0);
		return value;
	}

	/**
	 * checking input is String or not
	 * 
	 * @param value
	 *            :value to get
	 * @return :return a char value
	 */
	public char checkingString() {
		char value;
		do {// validation
			System.out.println("Do you want to continue?(Y/N)");
			while (!scanner.hasNext()) {
				System.out.println("That's not a character!");
				scanner.next();
			}
			value = scanner.next().toUpperCase().charAt(0);
			if (value == 'N')
				break;
		} while (value != 'Y');
		return value;
	}
}
