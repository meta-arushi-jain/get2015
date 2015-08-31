import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Arushi ----Class to create a concordance of characters occurring in a
 *         string
 *
 */
public class Concordance {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		String inputString = new String();

		System.out.println("Enter the string");
		inputString = sc.next();
		// String for concordence
		int length = inputString.length();
		String store[] = new String[length];
		int pos = 0;
		Set<Character> setConcordance = new HashSet<Character>();
		// Using a set to store all characters in a set

		for (int i = 0; i < length; i++) {
			setConcordance.add(inputString.charAt(i));
			// adding characters in set

		}

		Iterator<Character> itr = setConcordance.iterator();
		// checking occurrence using iterator
		while (itr.hasNext()) {
			char character = (char) itr.next();
			for (int i = 0; i < length; i++) {
				if (character == inputString.charAt(i)) {
					// if character matches
					if (store[pos] == null)
						store[pos] = "	" + i;
					else
						store[pos] = store[pos] + "	" + i;
					// storing all position of occurrence
				}
			}
			pos++;
		}

		Iterator<Character> itr1 = setConcordance.iterator();
		// printing all values of occurrence of characters in string using
		// iterator
		while (itr1.hasNext()) {
			for (int i = 0; i < pos; i++) {
				char value = itr1.next();
				System.out.println(value + store[i]);
			}
		}
	}
}
