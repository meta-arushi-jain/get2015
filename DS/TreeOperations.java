import java.util.ArrayList;
import java.util.List;

/**
 * @author Arushi----Class for completing all operations
 *
 */
public class TreeOperations {

	String result = "";
	// List for storing elements
	List<Integer> studentList = new ArrayList<Integer>();

	/**
	 * Function to add node in tree
	 * 
	 * @param node
	 *            ---first node
	 * @param element
	 *            ---element to add
	 * @return---node
	 */
	public Node addInTree(Node node, int element) {
		if (node == null) {
			node = new Node(element);
		}

		else {
			if (node.data > element) {

				node.left = addInTree(node.left, element);
			} else if (node.data < element) {
				node.right = addInTree(node.right, element);
			}
		}
		return node;
	}

	/**
	 * @param r1
	 *            ---starting node
	 * @return----inorder list(sorted list)
	 */
	public String traverseInorder(Node r1) {
		if (r1 != null) {
			traverseInorder(r1.left);
			result = result + " " + r1.data;
			traverseInorder(r1.right);
		}
		return result;

	}

	/**
	 * Function to check whether element is present or not
	 * 
	 * @param element
	 *            ---element to search
	 * @return----present or not
	 */
	public int contains(int element) {
		if (studentList.contains(element)) {
			return 1;

		} else
			return 0;

	}

}
