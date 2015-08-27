
package CollegeCounselling;

import java.util.Scanner;
/**
 * @authorArushi
 *Class to show all features
 */
public class CollegeCounselling {

	// main function
	public static void main(String arg[]) {
		Scanner scanner = new Scanner(System.in);
		College college = new College();
		String name;
		int rank;
		int choice;
		int noOfStudents;
		System.out.println("enter total number of students");
		do {// Validation
			while (!scanner.hasNextInt()) {
				System.out.println("That's not a number!Please enter again");
				scanner.next(); // this is important!
			}
			noOfStudents = scanner.nextInt();
		} while (noOfStudents <= 0);

		Student student = new Student(noOfStudents);
		do {
			CounsellingMenu.showBasicMenu();
			do {// Validation
				while (!scanner.hasNextInt()) {
					System.out
							.println("That's not a number!Please enter again");
					scanner.next(); // this is important!
				}
				choice = scanner.nextInt();
			} while (choice <= 0);

			switch (choice) {

			case 1:// to add students

				for (int i = 0; i < noOfStudents; i++) {
					System.out.println("enter name");
					name = scanner.next();
					System.out.println("enter rank");
					do {// Validation
						while (!scanner.hasNextInt()) {
							System.out
									.println("That's not a number!Please enter again");
							scanner.next(); // this is important!
						}
						rank = scanner.nextInt();
					} while (rank <= 0);

					student.enqueue(name, rank);
				}
				student.sortingStudentsByRank();
				break;

			case 2:// to print list of available colleges
				college.listOfCollegesWithAvailableSeats();
				break;

			case 3: // for allotment
				if (student.getFront().equals("noName")) {
					System.out.println("Please enter Details of student by choosing correct option");
					break;
				}
				for (int i = 0; i < noOfStudents; i++) {
					int check;
					name = student.getFront();
					if (college.getSeatsFilled() < 16) {
						do {
							college.selectCollege();
							System.out.println(name + "  enter your choice");
							do {// Validation
								while (!scanner.hasNextInt()) {
									System.out
											.println("That's not a number!Please enter again");
									scanner.next(); // this is important!
								}
								rank = scanner.nextInt();
								if(rank==1||rank==2||rank==3||rank==4||rank==5){
									break;
								}else {
									rank=-1;
								}
							} while (rank <= 0);

							check = college.allotToStudent(name, rank);
						} while (check != 1);
						name = student.dequeue();
						System.out.println(name + "  was alloted");
					}
					else {
						System.out.println("Seats full no vacancy");
						break;
					}
				}
				break;

			case 4:// to print list of students alloted to colleges
				college.printListOfNamesOfStudentsAlloted(student);
				break;

			case 5: // to empty lists
				student.makeEmpty();
				System.out.println("list cleared");
				break;

			default:
				System.out.println("invalid input");
				break;
			}
			do {// validation
				System.out.println("Do you want to continue(Y/N)"); // continuing
																	// the
																	// procedure
				while (!scanner.hasNext()) {
					System.out.println("That's not a character!");
					scanner.next(); // this is important!

				}
				choice = scanner.next().toUpperCase().charAt(0);
				if (choice == 'N')
					System.exit(0);
			} while (choice != 'Y');

		} while (choice == 'Y');
      scanner.close();
	}
}
