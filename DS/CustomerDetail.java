/**
 * @author Arushi ---Class to store entries of customer in form of objects
 *
 */
public class CustomerDetail {
	private int key;
	private int age;
	private String name;

	/**
	 * @param key
	 *            ----room no
	 * @param age
	 *            --=--age of customer
	 * @param name
	 *            --=-name of customer
	 */
	CustomerDetail(int key, int age, String name) {
		this.key = key;
		this.age = age;
		this.name = name;
	}

	/**
	 * @return the key
	 */
	public int getKey() {
		return key;
	}

	/**
	 * @return the age of customer
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param key
	 *            the key to set
	 */
	public void setKey(int key) {
		this.key = key;
	}

	/**
	 * @param value
	 *            the value to set
	 */
	public void setAge(int value) {
		this.age = value;
	}
}
