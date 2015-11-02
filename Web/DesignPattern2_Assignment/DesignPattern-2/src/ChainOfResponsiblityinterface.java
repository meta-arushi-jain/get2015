import java.util.Scanner;

/**
 * @author Arushi 
 * 
 * Main class to set the chain of responsibility
 *
 */
public class ChainOfResponsiblityinterface {

	public static void main(String[] args) {
		// creating objects of approvers
		Approver objectMentor = new Mentor();
		Approver objectSeniorMentor = new SeniorMentor();
		Approver objectHrManager = new HrManager();
		// setting successor
		objectMentor.SetSuccessor(objectSeniorMentor);
		objectSeniorMentor.SetSuccessor(objectHrManager);
		Scanner scan = new Scanner(System.in);
		System.out.println("enter number of days of leave");
		int leave = scan.nextInt();
		// starting from mentor
		objectMentor.ProcessRequest(leave);

	}

}