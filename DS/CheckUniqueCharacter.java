import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Arushi--- Class to check whether string is present in map or not, if
 *         present pass the operation there, else checking it properly
 *
 */
public class CheckUniqueCharacter {

	private static Map<String, Integer> cache = new HashMap<String, Integer>();

	// Map to store strings and their no of unique characters

	/**
	 * Function to check unique characters
	 * 
	 * @param inputString
	 *            ----input string to check no of unique character
	 * @return
	 */
	public Integer countUnique(String inputString) {

		Set<Character> characterSet = new HashSet<Character>();
		// checking for item string in cache
		if (cache.containsKey(inputString)) {
			System.out.println("It is from cache");
			return cache.get(inputString);
		} else {
			// if not find in cache map
			char[] charArray = inputString.toCharArray();
			for (char c : charArray)
				characterSet.add(c);
			int size = characterSet.size();
			// storing in cache
			cache.put(inputString, size);
			System.out.println("Unique characters are");
			System.out.println("" + characterSet);
			return size;
		}
	}
}
