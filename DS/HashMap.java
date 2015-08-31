/**
 * @author Arushi Class to map customer with their respective rooms and process
 *         them
 *
 */
public class HashMap {
	private final static int No_Of_Rooms = 11;
	int count = 0;
	CustomerDetail[] room;

	HashMap() {// constructor calling
		room = new CustomerDetail[No_Of_Rooms];
		for (int i = 0; i < No_Of_Rooms; i++) {
			room[i] = null;

		}
	}

	/**
	 * Function to check status of particular room
	 * 
	 * @param key
	 *            ----room no
	 */
	public void statusOfRoom(int key) {
		int hash = key;
		while (room[hash] != null && room[hash].getKey() != key)
			hash = (hash + 1) % No_Of_Rooms;
		if (room[hash] == null) {
			System.out.println("Not present");
			return;
		} else {
			System.out.println("Age:	" + room[hash].getAge());
			System.out.println("Name:	" + room[hash].getName());
		}
	}

	/**
	 * Function to book a room as per hash mapping concept
	 * 
	 * @param value
	 *            ----age of person
	 * @param name
	 *            -----name of person
	 */
	public void bookRoom(int value, String name) {
		int hash = (value % No_Of_Rooms);
		if (count < No_Of_Rooms) {
			while ((room[hash] != null)) {
				hash = (hash + 1) % No_Of_Rooms;
			}
			room[hash] = new CustomerDetail(hash, value, name);
			System.out.println("Your room is" + hash);
			count = count + 1;
		} else {
			System.out.println("Rooms not possible");
			return;
		}
	}

	/**
	 * ---Function to delete a particular room
	 * 
	 * @param hashRoom
	 *            ---Room to delete
	 */
	public void deleteRoom(int hashRoom) {
		room[hashRoom] = null;
		count = count - 1;

	}

	/**
	 * Function to clear all rooms
	 */
	public void clear() {
		for (int i = 0; i < No_Of_Rooms; i++) {
			room[i] = null;

		}
		count = 0;
		System.out.println("All rooms are empty");
	}

	/**
	 * Function to display status of all rooms
	 */
	public void display() {
		int k = 0;
		while (k < No_Of_Rooms) {
			System.out.println("Room no  " + k + "  status");
			if (room[k] != null) {
				System.out.println("Age:	" + room[k].getAge());
				System.out.println("Name:	" + room[k].getName());
				k++;
			} else {
				System.out.println("empty right now");
				k++;
			}
		}
	}

}
