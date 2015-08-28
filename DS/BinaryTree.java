/**
 * @author Arushi--- class to add nodes in tre and traversing them in preorder
 *         and postorder
 *
 */
public class BinaryTree {

	private int data;
	private BinaryTree left;
	private BinaryTree right;

	public BinaryTree(int num) {// constructor
		this.data = num;
		this.left = null;
		this.right = null;
	}

	public void addNode(int num) {// function to add node
		if (num < this.data) {
			if (this.left != null) {
				this.left.addNode(num);
			} else {
				this.left = new BinaryTree(num);
			}

		} else {
			if (this.right != null) {
				this.right.addNode(num);
			} else {
				this.right = new BinaryTree(num);
			}

		}
	}

	public void traversePreOrder() {// /traversing preorder
		System.out.println(this.data);
		if (this.left != null) {
			this.left.traversePreOrder();
		}
		if (this.right != null) {
			this.right.traversePreOrder();
		}
	}

	public void traversePostOrder() {// traversing postorder
		if (this.left != null) {
			this.left.traversePostOrder();
		}
		if (this.right != null) {
			this.right.traversePostOrder();
		}
		System.out.println(this.data);
	}

}
