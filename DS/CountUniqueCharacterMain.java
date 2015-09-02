import java.util.Scanner;

/**
 * @author Arushi
 * 
 *         Main class to chek count of unique characters
 */
public class CountUniqueCharacterMain {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		String inputString = "";
		int uniqueCharacters, choice;
		CheckUniqueCharacter uniqueCounter = new CheckUniqueCharacter();

		do {
			// input a string from user side
			System.out.println("Enter a String: ");

			inputString = scan.nextLine();

			inputString = inputString.replaceAll("\\s", "");
			// calling function to trace
			uniqueCharacters = uniqueCounter.countUnique(inputString);
			// printing no of unique characters
			System.out.println("Number of Unique characters in " + inputString
					+ " : " + uniqueCharacters);
			System.out
					.println("\nDo you want to continue (Type y to continue) \n");

			choice = scan.next().charAt(0);
			scan.nextLine();
		} while (choice == 'Y' || choice == 'y');
		scan.close();

	}
}
