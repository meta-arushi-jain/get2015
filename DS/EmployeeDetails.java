/**
 * @author Arushi ---Class to add details of employee,overriding equals, to
 *         String, hash code function and to compare function
 * 
 */
public class EmployeeDetails implements Comparable<Object> {
	private int empId;
	private String name;
	private String address;

	/**
	 * constructor calling
	 * 
	 * @param empId
	 *            ----id of employee
	 * @param name
	 *            ----name of employee
	 * @param address
	 *            ----address of employee
	 */
	public EmployeeDetails(int empId, String name, String address) {

		this.empId = empId;
		this.name = name;
		this.address = address;
	}

	/**
	 * @return the empId
	 */
	public Integer getEmpId() {
		return empId;
	}

	/**
	 * @param empId
	 *            the empId to set
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
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
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public int compareTo(Object o) {
		return getEmpId().compareTo(((EmployeeDetails) o).getEmpId());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeDetails other = (EmployeeDetails) obj;
		if (empId != other.empId)
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()----- returning string containing object
	 * details
	 */
	public String toString() {
		return "name: " + getName() + "  id:  " + getEmpId() + "  address: "
				+ getAddress();

	}

}
