import java.util.Collections;
import java.util.Iterator;

/**
 * @author Arushi---- Class to sort different objects based on their employee id
 *         in natural order
 * 
 */
public class EmployeeSortNaturalOrder {

	/**
	 * Function to sort objects in the list based on employee id using
	 * overridden functions in employee details class
	 */
	public void sortNaturalorder() {

		Collections.sort(EmployeeSortMain.employee);
		// To print the objects details by to string function after sorting

		if (EmployeeSortMain.employee.size() == 0) {
			System.out.println("List is empty");
		}
		Iterator<EmployeeDetails> employeeIterator1 = (EmployeeSortMain.employee
				.iterator());
		while (employeeIterator1.hasNext()) {

			EmployeeDetails e1 = employeeIterator1.next();
			System.out.println(e1.toString());

		}
	}

}
