import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Arushi
 *
 */
public class TestLinearSearch {

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
		int[] arr = { 2, 5, 8, 9, 10, 77, 55 };
		int temp = LinearSearch.linearSearch(arr, 7, 88, 0);
		assertEquals("correct", 0, temp);
	}

	/**
	 * Testing for second parameter
	 */
	@Test
	public void test1() {
		int[] arr = { 2, 5, 8, 9, 10, 77, 55, 11 };
		int temp = LinearSearch.linearSearch(arr, 8, 77, 0);

		assertEquals("correct", 6, temp);
	}

}
