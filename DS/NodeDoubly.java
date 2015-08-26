/**
 * @author Arushi----Class node doubly
 *
 */
public class NodeDoubly {

	protected int value;
	protected NodeDoubly nlink;
	protected NodeDoubly plink;

	/* Constructor */
	public NodeDoubly() {
		nlink = null;
		value = 0;
		plink = null;
	}

	/* Constructor */
	public NodeDoubly(int data, NodeDoubly n, NodeDoubly p) {
		value = data;
		nlink = n;
		plink = p;
	}

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @param value
	 *            the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}

	/**
	 * @return the nlink
	 */
	public NodeDoubly getNlink() {
		return nlink;
	}

	/**
	 * @param nlink
	 *            the nlink to set
	 */
	public void setNlink(NodeDoubly nlink) {
		this.nlink = nlink;
	}

	/**
	 * @return the plink
	 */
	public NodeDoubly getPlink() {
		return plink;
	}

	/**
	 * @param plink
	 *            the plink to set
	 */
	public void setPlink(NodeDoubly plink) {
		this.plink = plink;
	}

}
