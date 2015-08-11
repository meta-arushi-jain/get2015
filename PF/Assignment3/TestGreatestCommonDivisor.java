import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * ----Program to test Greatest common divisor
 * 
 * @author Arushi
 *
 */
public class TestGreatestCommonDivisor {

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
	 * Testing for first parameter.
	 * 
	 */
	@Test
	public void test() {
		int greatestCommonDivisor = GreatestCommonDivisor.gcd(2, 1);
		assertEquals("correct", 1, greatestCommonDivisor);

	}

	/**
	 * Testing for second parameter.
	 * 
	 */
	@Test
	public void test1() {
		int greatestCommonDivisor = GreatestCommonDivisor.gcd(12, 18);
		assertEquals("correct", 6, greatestCommonDivisor);

	}

	/**
	 * Testing for third parameter.
	 * 
	 */
	@Test
	public void test2() {
		int greatestCommonDivisor = GreatestCommonDivisor.gcd(100, 3);
		assertEquals("correct", 1, greatestCommonDivisor);

	}

}
