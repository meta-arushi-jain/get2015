import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * @author Arushi--- Main Class to utilize all the functions regarding different
 *         sort methods
 * 
 */
public class EmployeeSortMain {
	static List<EmployeeDetails> employee = new ArrayList<EmployeeDetails>();

	// List to add all employee details

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int choice;

		do {// Menu
			System.out.println("Choose something");

			System.out.println("\nEmployee Operations\n");
			System.out.println("1. Add Employee ");
			System.out
					.println("2.  sorting on the collection employee i.e natural order");
			System.out
					.println("3.  Perform sorting on the collection based on the employee Name.");
			while (!sc.hasNextInt()) {
				System.out.println("Please Enter a number only");
				sc.next();
			}
			choice = sc.nextInt();
			switch (choice) {
			case 1:// Adding employees in list if not repeated
				System.out.println("Enter employee id");
				while (!sc.hasNextInt()) {
					System.out.println("Please Enter a number only");
					sc.next();
				}
				int id = sc.nextInt();
				System.out.println("Enter name");
				String name = sc.next();
				System.out.println("enter address");
				sc.nextLine();
				String address = sc.nextLine();

				EmployeeDetails emp = new EmployeeDetails(id, name, address);
				if (employee.size() == 0) {
					employee.add(emp);
					break;
				} else {
					// checking for repetition of id
					Iterator<EmployeeDetails> employeeIterator = employee
							.iterator();
					while (employeeIterator.hasNext()) {
						if (employeeIterator.next().equals(emp)) {
							System.out
									.println(" this employee id is already taken");
							break;
						}
						employee.add(emp);
					}

				}

				break;

			case 2:
				// Sorting by natural order based on employee id
				EmployeeSortNaturalOrder sortNatural = new EmployeeSortNaturalOrder();
				sortNatural.sortNaturalorder();
				break;
			case 3:
				// Sorting list by name using comparator
				EmployeeSortNameComparator sortName = new EmployeeSortNameComparator();
				sortName.sortByName();
				break;

			default:

				System.out.println("ENTER RIGHT VALUES");
			}

			System.out
					.println("\nDo you want to continue (Type y to continue) \n");

			choice = sc.next().charAt(0);
		} while (choice == 'Y' || choice == 'y');
		sc.close();

	}

}
