/**
 * @author Arushi---
 * 
 *         Operations to perform doubly link list
 *
 */
public class DoublyLinkListOperation {
	protected NodeDoubly start;
	protected NodeDoubly end;
	public int size;

	/* Constructor */
	public DoublyLinkListOperation() {
		start = null;
		end = null;
		size = 0;
	}

	/* Function to get size of list */
	public int getSize() {
		return size;
	}

	/* Function to insert an element */
	/**
	 * @param val
	 *            ----value to add
	 */
	public void createLinkList(int val) {
		NodeDoubly nptr = new NodeDoubly(val, null, null);
		size++;
		if (start == null) {
			start = nptr;
			end = start;
		} else {

			end.setNlink(nptr);
			nptr.setPlink(end);
			end = nptr;

		}

	}

	/**
	 * @param val
	 *            ---function to remove element by value
	 */
	public void removeElement(int val) {

		NodeDoubly ptr = start;
		NodeDoubly temp = start;
		int pos = 0;

		while ((pos != size) && (ptr.getValue() != val)) {
			temp = ptr;
			ptr = ptr.getNlink();
			pos = pos + 1;
		}
		if (pos == 0) {
			start.nlink.plink = null;
			start = start.nlink;
			size--;
		}

		else if (pos == size) {
			System.out.println("element not found");
		} else {
			temp.setNlink(ptr.getNlink());
			ptr.getNlink().setPlink(temp);
			size--;
		}

	}

	/* Function to insert an element at position */
	/**
	 * @param val
	 *            ---value to add
	 * @param pos
	 *            ---position of insert
	 */
	public void insertAtPos(int val, int pos) {
		NodeDoubly nptr = new NodeDoubly(val, null, null);
		NodeDoubly ptr = start;
		if (pos == 1) {
			nptr.setNlink(start);
			start = nptr;
		} else {
			pos = pos - 1;
			for (int i = 1; i < size; i++) {
				if (i == pos) {
					NodeDoubly tmp = ptr.getNlink();
					ptr.setNlink(nptr);
					nptr.setPlink(ptr);

					nptr.setNlink(tmp);
					tmp.setPlink(nptr);
					break;
				}
				ptr = ptr.getNlink();
			}
		}
		size++;
	}

	/**
	 * @param position
	 *            ---index position
	 * 
	 * 
	 *            Function to retrieve element at position
	 */
	public void retrieveAtPosition(int position) {
		NodeDoubly ptr = start;
		if (position > size) {
			System.out.println("Not possible");
		} else {
			for (int i = 1; i < position; i++) {
				ptr = ptr.getNlink();

			}
			System.out.println("value is" + ptr.getValue());
		}

	}

	/**
	 * @param pos
	 *            ----delete at position function to delete at position
	 */
	public void deleteAtPos(int pos) {
		if (pos == 1) {
			start = start.getNlink();
			start.setPlink(null);
			size--;
			return;
		}
		if (pos == size) {
			NodeDoubly s = start;
			NodeDoubly t = start;
			while (s != end) {
				t = s;
				s = s.getNlink();
			}
			end = t;
			t.nlink.setPlink(null);
			end.setNlink(null);
			size--;
			return;
		}
		NodeDoubly ptr = start;
		pos = pos - 1;
		for (int i = 1; i < size - 1; i++) {
			if (i == pos) {
				NodeDoubly tmp = ptr.getNlink();
				tmp = tmp.getNlink();
				ptr.setNlink(tmp);
				tmp.setPlink(ptr);
				break;
			}
			ptr = ptr.getNlink();
		}
		size--;
	}

	/**
	 * function to reverse
	 */
	public void reverse() {
		NodeDoubly tempNode1 = start, tempNode2 = start;
		int temp;
		while (tempNode2.nlink != null) // apply simple sorting to sort the
		// elements
		// of Linked list
		{
			tempNode2 = tempNode2.nlink;
		}

		for (int i = 0; i < size / 2; i++) // apply simple sorting to sort the
											// elements
		// of Linked list
		{
			temp = (Integer) tempNode1.value;
			tempNode1.value = tempNode2.value;
			tempNode2.value = temp;
			tempNode1 = tempNode1.nlink;
			tempNode2 = tempNode2.plink;
		}
	}

	/**
	 * function to sort
	 */
	public void sort() {

		NodeDoubly tempNode1 = start, tempNode2;
		int temp;
		while (tempNode1 != null) // apply simple sorting to sort the elements
									// of Linked list
		{
			tempNode2 = start;
			while (tempNode2.nlink != null) {
				if ((tempNode2.value) > (tempNode2.nlink.value)) {
					temp = tempNode2.value;
					tempNode2.value = tempNode2.nlink.value;
					tempNode2.nlink.value = temp;
				}
				tempNode2 = tempNode2.nlink;
			}
			tempNode1 = tempNode1.nlink;
		}
		NodeDoubly current = start;
		while (current != null) {
			System.out.println(current.value);
			current = current.nlink;
		}

	}

	/**
	 * Function to display
	 */
	public void display() {
		System.out.print("\nDoubly Linked List = ");
		if (size == 0) {
			System.out.print("empty\n");
			return;
		}
		if (start.getNlink() == null) {
			System.out.println(start.getValue());
			return;
		}
		NodeDoubly ptr = start;
		System.out.print(start.getValue() + "->");
		ptr = start.getNlink();
		while (ptr.getNlink() != null) {
			System.out.print(ptr.getValue() + "->");
			ptr = ptr.getNlink();
		}
		System.out.print(ptr.getValue() + "\n");
	}

}
