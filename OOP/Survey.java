import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Arushi It is the main class in which we have to show the whole survey
 *         procedure to user
 *
 */
public class Survey {

	public static void main(String args[]) {

		try {
			String[] multiChoice = new String[10];

			String a = "  ";

			Scanner scan = new Scanner(System.in);
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			SurveyQuestion object1 = new SurveyQuestion();
			Answer object2 = new Answer();
			int ch, count = 0, i, result;
			double totalA = 0.0, totalB = 0.0, totalC = 0.0, totalD = 0.0;
			char choice;
			String answer = "";
			// Asking for survey from user
			do {
				System.out.println("Menu");
				System.out.println("1.Take survey");
				System.out.println("2.View Statistics");
				System.out.println("3.View people and answers");
				System.out.println("Enter your choice");
				ch = scan.nextInt();
				switch (ch) {
				case 1:// attempting survey
					count = count + 1;
					System.out.println(object1.singleSelect());
					result = scan.nextInt();
					object2.singleAnsSet(result, count);
					System.out.println(object1.multipleSelect());
					// answer= br.readLine();
					int j = 0;

					while ((!answer.equals("#")) && (j < 4)) {
						answer = br.readLine();
						a = a + " " + answer;

						object2.multipleAnsSet(answer, count);

						System.out.println(a);

						j++;
					}
					multiChoice[count] = a;

					System.out.println(object1.text());
					answer = br.readLine();
					;
					object2.textSet(answer, count);
					break;
				case 2:// Checking statistics
					for (i = 1; i <= count; i++) {
						result = object2.singleAnsGet(i);
						if (result == 1) {
							totalA += 1.0;
						}
						if (result == 2) {
							totalB += 1.0;
						}
						if (result == 3) {
							totalC += 1.0;
						}
						if (result == 4) {
							totalD += 1.0;
						}
					}
					System.out.println("Total percentage of 1: " + totalA
							/ count * 100);
					System.out.println("Total percentage of 2: " + totalB
							/ count * 100);
					System.out.println("Total percentage of 3: " + totalC
							/ count * 100);
					System.out.println("Total percentage of 4: " + totalD
							/ count * 100);

					break;
				case 3:// Checking for all users information
					for (i = 1; i <= count; i++) {
						System.out.println("Participant " + i);
						System.out.println(object1.singleSelect());
						result = object2.singleAnsGet(i);
						System.out.println(result);
						System.out.println(object1.multipleSelect());
						System.out.println(multiChoice[count]);

						System.out.println(object1.text());
						answer = object2.textAnsGet(i);
						System.out.println(answer);
					}
					break;
				}
				System.out.println("Do you want to continue(y/n)");// continuing
																	// the
																	// procedure
				choice = scan.next().charAt(0);

			} while (choice == 'y');
			scan.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
