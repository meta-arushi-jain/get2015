import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * ------test cases for finding remainder
 * 
 * @author Arushi
 *
 */
public class TestRemainder {

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
		int remainder = Remainder.rem(2, 1);
		assertEquals("correct", 0, remainder);
	}

	/**
	 * Testing for second parameter
	 */
	@Test
	public void test1() {
		int remainder = Remainder.rem(2, 0);
		assertEquals("correct", -1, remainder);
	}

	/**
	 * Testing for third parameter
	 */
	@Test
	public void test2() {
		int remainder = Remainder.rem(100, 3);
		assertEquals("correct", 1, remainder);
	}

}
