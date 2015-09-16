/**
 * 
 */

import java.sql.SQLException;
import java.util.List;

/**
 * -- main class for library
 * 
 * @author Arushi
 *
 */
public class LibraryManagementMain {

	/**
	 * 
	 * 
	 * Main function to process
	 * 
	 * @param args
	 * @throws SQLException
	 */
	public static void main(String[] args) throws SQLException {
		int choice;
		char mainChoice;

		Utility utility = new Utility();
		LibraryHelperClass libraryHelperClass = new LibraryHelperClass();
		do {
			menu();
			// showing menu
			choice = utility.checkingChoice();
			switch (choice) {
			case 1:
				// displaying book detail
				List<Title> titleList = libraryHelperClass
						.getBooksDataOfAuthor();

				if (titleList.size() != 0) {
					System.out.println("List of Books:");
					for (Title title : titleList) {
						System.out.println(title.getTitleName());
					}
				} else {
					System.out.println("No Book Published of this author");
				}

				break;
			case 2:
				// issue book
				boolean flag = libraryHelperClass.issueBook();
				if (flag == true) {
					System.out.println(" book is issued");
				} else {
					System.out.println("Book can't be issued ");
				}
				break;
			case 3:
				// deleting books
				int numberOfBooks = libraryHelperClass.deleteNotRequiedBooks();

				System.out
						.println("Number of Books not used since one year and hence deleted :"
								+ numberOfBooks);
				break;
			default:
				System.out.println("Enter correct choice");
			}
			mainChoice = utility.checkingString();
		} while (mainChoice == 'Y');
		libraryHelperClass.getConnection().close();
	}

	public static void menu() {
		System.out.println("Menu :");
		System.out.println("1.To display books published by given author");
		System.out.println("2. issue the given book");
		System.out
				.println("3.Delete all those books which were not issued in last 1 year");
	}

}
