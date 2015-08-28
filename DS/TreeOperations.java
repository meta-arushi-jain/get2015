//Class containing check for mirror functions and insertion functions
/**
 * @author Arushi Class for adding tree nodes and checking for in order
 *
 */
public class TreeOperations {

	String result = "";

	// To start inserting from 1st tree
	public Node addForFirstTree(Node node, int element) {
		if (node == null) {
			node = new Node(element);
		}

		else {
			if (node.data > element) {

				node.left = addForFirstTree(node.left, element);
			} else {
				node.right = addForFirstTree(node.right, element);
			}
		}
		return node;
	}

	// To start inserting from 2nd tree
	public Node addForSecondTree(Node node, int element) {
		if (node == null) {
			node = new Node(element);
		}

		else {
			if (node.data < element) {

				node.left = addForSecondTree(node.left, element);
			} else {
				node.right = addForSecondTree(node.right, element);

			}
		}
		return node;
	}

	// To check for mirror image
	public String traverseInorder(Node r1) {
		if (r1 != null) {
			traverseInorder(r1.left);
			result = result + r1.data;
			traverseInorder(r1.right);
		}
		return result;

	}

}
