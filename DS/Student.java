package CollegeCounselling;

import java.util.Arrays;

/**
 * @author Arushi -----Class student It is to store data of students in form of
 *         queue and follow its procedures
 */

public class Student {
	private int front = -1; // position where element to be deleted
	private int rear = -1; // position where element to be entered
	private String[] studentNameList;
	private int[] studentRanklist;

	/**
	 * constructor to initialize limit of list
	 * 
	 * @param length
	 *            :no of student
	 */
	Student(int length) {
		studentNameList = new String[length];
		studentRanklist = new int[length];
	}

	/**
	 * Function to add student
	 * 
	 * @param name
	 *            :name of student to add
	 * @param rank
	 *            :rank of that student
	 */
	public void enqueue(String name, int rank) {
		if (front < 20) {
			if (front == -1 && rear == -1) {
				front++;
				rear++;

			} else {
				rear++;
			}
			studentRanklist[rear] = rank;
			studentNameList[rear] = name;
		} else {
			studentNameList = Arrays.copyOf(studentNameList,
					studentNameList.length + 10);
			rear++;
			studentNameList[rear] = name;
			studentRanklist[rear] = rank;
		}

	}

	/**
	 * Function to remove student
	 * 
	 * @return name of student removed
	 */
	public String dequeue() {
		String name;
		if (rear != -1) {
			name = studentNameList[front];
			front++;
		} else {
			System.out.println("queue empty");
			name = "";
		}
		return name;
	}

	/**
	 * Function to clear list of all data of student and college
	 */
	public void makeEmpty() {
		studentNameList = null;
		front = -1;
		rear = -1;
		studentRanklist = null;
	}

	/**
	 * to get name at top of queue
	 * 
	 * @return :element at front value
	 */
	public String getFront() {
		if (front != -1) {
			return studentNameList[front];
		} else {
			return "noName";
		}
	}

	/**
	 * for sorting student list according to their rank
	 */
	public void sortingStudentsByRank() {
		String forName = "";
		int forRank;

		for (int i = 0; i < (studentNameList.length); i++) {
			for (int j = i; j < studentNameList.length - 1; j++) {
				if (studentRanklist[j] > studentRanklist[j + 1]) {
					forName = studentNameList[j + 1];
					studentNameList[j + 1] = studentNameList[j];
					studentNameList[j] = forName;

					forRank = studentRanklist[j + 1];
					studentRanklist[j + 1] = studentRanklist[j];
					studentRanklist[j] = forRank;
				}

			}

		}

	}

	/**
	 * @return the rear value
	 */
	public int getRear() {
		return rear;
	}

	/**
	 * @param rear
	 *            the rear to set
	 */
	public void setRear(int rear) {
		this.rear = rear;
	}

}
