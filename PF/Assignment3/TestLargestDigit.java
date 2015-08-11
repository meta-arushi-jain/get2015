import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * ---Program to check test cases for largest digit
 * 
 * @author Arushi
 *
 */
public class TestLargestDigit {
	LargestDigit digit = new LargestDigit();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Testing for first parameter
	 */
	@Test
	public void test() {
		int largestValue = digit.largestDigit(2);
		assertEquals("correct", 2, largestValue);

	}

	/**
	 * Testing for second parameter
	 */

	@Test
	public void test1() {
		int largestValue = digit.largestDigit(1257369);
		assertEquals("correct", 9, largestValue);

	}

	/**
	 * Testing for third parameter
	 */

	@Test
	public void test2() {
		int largestValue = digit.largestDigit(444);
		assertEquals("correct", 4, largestValue);

	}

}
