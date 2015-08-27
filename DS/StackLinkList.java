/**
 * @author Arushi class to follow all procedures like push, pop,display and
 *         infix to post fix conversion
 *
 */
public class StackLinkList {
	protected static StackNode start;
	protected static StackNode end;
	public static int size;

	/**
	 * Function to store data by using push
	 * 
	 * @param item
	 *            ---item to add
	 */
	public void push(String item) {
		StackNode nptr = new StackNode(item);
		size++;
		if (start == null) {
			start = nptr;
			end = start;
		} else {
			nptr.setLink(start);
			start = nptr;
		}

	}

	/**
	 * Function to pop
	 * 
	 * @return----popped data
	 */
	public String pop() {
		String string = start.data;
		start = start.getLink();
		size--;
		return string;
	}

	/**
	 * Function to return top
	 * 
	 * @return---returning top element
	 */
	public static String getTopElement() {
		String string = start.data;

		return string;
	}

	/**
	 * @param ch
	 *            ---character entered
	 * @return----boolean value whether it is alphabet or not
	 */
	boolean isAlphabet(char ch) {
		if ((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9'))
			return true;
		else
			return false;

	}

	/**
	 * @param c
	 *            ----operator value
	 * @return-----whether operator or not
	 */
	private boolean isOperator(char c) {
		if (c == '+' || c == '-' || c == '*' || c == '/' || c == '^')
			return true;
		return false;
	}

	/**
	 * Function to check whether we can enter value in stack
	 * 
	 * @param inStackValue
	 *            -----character value in stack
	 * @param currentValue
	 *            ------operator value to be stored
	 * @return
	 */
	private boolean checkPrecedenceOfStackValue(char inStackValue,
			char currentValue) {
		if ((currentValue == '+' || currentValue == '-')
				&& (inStackValue == '+' || inStackValue == '-')) {
			return true;
		} else if ((currentValue == '*' || currentValue == '/')
				&& (inStackValue == '+' || inStackValue == '-'
						|| inStackValue == '*' || inStackValue == '/')) {
			return true;
		}

		else {
			return false;
		}
	}

	/**
	 * function to convert infix to prefix
	 * 
	 * @param infix
	 *            -----infix expression
	 * @return
	 */
	public String infixToPostfix(String infix) {

		String postfix = ""; // equivalent postfix is empty initially

		// stack to hold symbols

		push("#"); // symbol to denote end of stack
		for (int i = 0; i < infix.length(); i++) {

			char inputSymbol = infix.charAt(i); // symbol
			if (isOperator(inputSymbol)) {
				while (checkPrecedenceOfStackValue(inputSymbol, getTopElement()
						.charAt(0))) {
					postfix += pop();
				}
				push(Character.toString(inputSymbol));
			} else if (inputSymbol == '(') {
				push(Character.toString(inputSymbol));
			} else if (inputSymbol == ')') {

				while (!getTopElement().equals("(")) { // repeatedly pops if
														// right parenthesis
														// until left
														// parenthesis is found
					postfix += pop();
				}
				pop();
			} else {
				postfix += inputSymbol;
			}
		}

		while (!getTopElement().equals("#")) // pops all elements of stack left
		{
			postfix += pop();
		}
		return postfix;
	}

	/**
	 * Function to display
	 */
	public void display() {

		System.out.print("\nStack contains = ");
		if (size == 0) {
			System.out.println("empty\n");
			return;
		}
		if (start.getLink() == null) {
			System.out.println(start.getData());
			return;
		}
		StackNode ptr = start;
		System.out.println(start.getData());
		ptr = start.getLink();
		while (ptr.getLink() != null) {
			System.out.println(ptr.getData());
			ptr = ptr.getLink();
		}
		System.out.println(ptr.getData() + "\n");

	}

}
