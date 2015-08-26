/**
 * @author Arushi---- Class node
 *
 */
public class Node {

	protected int value;
	protected Node link;

	/* Constructor */
	public Node() {
		link = null;
		value = 0;
	}

	/* Constructor */
	public Node(int data, Node n) {
		value = data;
		link = n;
	}

	/* Function to set link to next Node */
	public void setLink(Node n) {
		link = n;
	}

	/* Function to set value to current Node */
	public void setValue(int data) {
		value = data;
	}

	/* Function to get link to next node */
	public Node getLink() {
		return link;
	}

	/* Function to get value from current Node */
	public int getValue() {
		return value;
	}

}
