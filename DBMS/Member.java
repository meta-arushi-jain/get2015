/**
 * 
 */

/**
 * @author Arushi--- POJO class for member type entity
 *
 */
public class Member {
	private int memberId;
	private String memberName;
	private String addressLineFirst;
	private String addressLineSecond;
	private char category;
	private String personType;

	/**
	 * @param memberId
	 * @param memberName
	 * @param addressLineFirst
	 * @param addressLineSecond
	 * @param category
	 * @param personType
	 */
	public Member(int memberId, String memberName, String addressLineFirst,
			String addressLineSecond, char category, String personType) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.addressLineFirst = addressLineFirst;
		this.addressLineSecond = addressLineSecond;
		this.category = category;
		this.personType = personType;
	}

	// getters and setters
	/**
	 * 
	 * @return the memberId
	 */
	public int getMemberId() {
		return memberId;
	}

	/**
	 * @param memberId
	 *            the memberId to set
	 */
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	/**
	 * @return the memberName
	 */
	public String getMemberName() {
		return memberName;
	}

	/**
	 * @param memberName
	 *            the memberName to set
	 */
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	/**
	 * @return the addressLineFirst
	 */
	public String getAddressLineFirst() {
		return addressLineFirst;
	}

	/**
	 * @param addressLineFirst
	 *            the addressLineFirst to set
	 */
	public void setAddressLineFirst(String addressLineFirst) {
		this.addressLineFirst = addressLineFirst;
	}

	/**
	 * @return the addressLineSecond
	 */
	public String getAddressLineSecond() {
		return addressLineSecond;
	}

	/**
	 * @param addressLineSecond
	 *            the addressLineSecond to set
	 */
	public void setAddressLineSecond(String addressLineSecond) {
		this.addressLineSecond = addressLineSecond;
	}

	/**
	 * @return the category
	 */
	public char getCategory() {
		return category;
	}

	/**
	 * @param category
	 *            the category to set
	 */
	public void setCategory(char category) {
		this.category = category;
	}

	/**
	 * @return the personType
	 */
	public String getPersonType() {
		return personType;
	}

	/**
	 * @param personType
	 *            the personType to set
	 */
	public void setPersonType(String personType) {
		this.personType = personType;
	}

}
