/**
 * 
 */

/**
 * @author Arushi--- POJO Class to store entities of book type data
 *
 */
public class Book {
	private int accessionNo;
	private int titleIdOfBook;
	private String purchaseDate;
	private double price;
	private int status;

	/**
	 * @param accessionNo
	 * @param titleIdOfBook
	 * @param purchaseDate
	 * @param price
	 * @param status
	 */
	// Constructor Calling
	public Book(int accessionNo, int titleIdOfBook, String purchaseDate,
			double price, int status) {
		super();
		this.accessionNo = accessionNo;
		this.titleIdOfBook = titleIdOfBook;
		this.purchaseDate = purchaseDate;
		this.price = price;
		this.status = status;
	}

	// getters and setters

	/**
	 * @return the accessionNo --Function to return accession no
	 */
	public int getAccessionNo() {
		return accessionNo;
	}

	/**
	 * Function to set accession no
	 * 
	 * @param accessionNo
	 *            the accessionNo to set
	 */
	public void setAccessionNo(int accessionNo) {
		this.accessionNo = accessionNo;
	}

	/**
	 * Function to get titleId
	 * 
	 * @return the titleIdOfBook
	 */
	public int getTitleIdOfBook() {
		return titleIdOfBook;
	}

	/**
	 * Function to set title Id
	 * 
	 * @param titleIdOfBook
	 *            the titleIdOfBook to set
	 */
	public void setTitleIdOfBook(int titleIdOfBook) {
		this.titleIdOfBook = titleIdOfBook;
	}

	/**
	 * Function to get purchase date
	 * 
	 * @return the purchaseDate
	 */
	public String getPurchaseDate() {
		return purchaseDate;
	}

	/**
	 * function to set purchase date
	 * 
	 * @param purchaseDate
	 *            the purchaseDate to set
	 */
	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	/**
	 * function to get price
	 * 
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * function to set price
	 * 
	 * @param price
	 *            the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * function to get status
	 * 
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * function to set status
	 * 
	 * @param status
	 *            the status to set
	 */
	public void setStatus(int status) {
		this.status = status;
	}

}
