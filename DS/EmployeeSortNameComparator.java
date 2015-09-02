import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/**
 * @author Arushi-- Class to sort employee objects based on their name
 * 
 */
public class EmployeeSortNameComparator implements Comparator<EmployeeDetails> {

	@Override
	// Overriding compare function
	public int compare(EmployeeDetails employee1, EmployeeDetails employee2) {

		return employee1.getName().compareTo(employee2.getName());

	}

	/**
	 * Function to sort all the object elements in list
	 */
	public void sortByName() {
		Collections.sort(EmployeeSortMain.employee,
				new EmployeeSortNameComparator());

		// Printing sorted elements
		if (EmployeeSortMain.employee.size() == 0) {
			System.out.println("List is empty");
		}
		Iterator<EmployeeDetails> employeeIterator2 = (EmployeeSortMain.employee
				.iterator());
		while (employeeIterator2.hasNext()) {

			EmployeeDetails e1 = employeeIterator2.next();
			System.out.println(e1.toString());

		}
	}

}
