import java.util.Scanner;


/**
 * @author Arushi
 * 
 */
public class RoomAllotmentMain {

	/**
	 * Class to implement all operations by taking input from users
	 */
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		Scanner sc = new Scanner(System.in);
		char ch;
		do{
		System.out.println("\nHash Table Operations\n");
		System.out.println("1. book room ");
		System.out.println("2. CheckOut by customer");
		System.out.println("3. room status");
		System.out.println("4. clear");
		System.out.println("5. status of all rooms");
		

		int choice;
		do {// Validation

			while (!sc.hasNextInt()) {
				System.out.println("That's not a number!Please enter again");
				sc.next(); // this is important!
			}
			choice = sc.nextInt();
		} while (choice <= 0);


		switch (choice) {
		case 1:
     //Room Booking
			System.out.println("enter your name");

			String name = sc.next();
			System.out.println("Enter your age");
			int age;
			do {// Validation

				while (!sc.hasNextInt()) {
					System.out.println("That's not a number!Please enter again");
					sc.next(); // this is important!
				}
				age = sc.nextInt();
			} while (age <= 0);
			hm.bookRoom(age, name);
			break;
		case 2:
			//checkout of a room
			System.out.println("Enter room to make free");
			int room;
			do {// Validation

				while (!sc.hasNextInt()) {
					System.out.println("That's not a number!Please enter again");
					sc.next(); // this is important!
				}
				room = sc.nextInt();
			} while (room < 0);
			hm.deleteRoom( room);
			System.out.println("Room is free now");
			break;
		case 3://room status
			System.out.println("Enter room  to check its details");
			int check_Room;
			do {// Validation

				while (!sc.hasNextInt()) {
					System.out.println("That's not a number!Please enter again");
					sc.next(); // this is important!
				}
				check_Room = sc.nextInt();
			} while (check_Room <= 0);
			hm.statusOfRoom(check_Room);
			break;
		case 4://clear all rooms
			 hm.clear();
			System.out.println("Hash Table Cleared\n");
			break;
		case 5://display status of all rooms
			hm.display();
			break;
		default:
			System.out.println("Wrong Entry \n ");
			break;
		}
		 System.out.println("\nDo you want to continue (Type y or n) \n");
         ch = sc.next().charAt(0);                        
     } while (ch == 'Y'|| ch == 'y');  
        sc.close();
	}

}
