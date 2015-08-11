import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Testing for test cases of BinarySearch
 * 
 * @author Arushi
 * 
 */
public class TestBinarySearch {

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
		int[] arr = { 2, 5, 8, 9, 10, 55, 77 };
		int temp = BinarySearch.recursiveBinarySearch(arr, 0, 7, 77);
		assertEquals("correct", 6, temp);
	}

	/**
	 * Testing for second parameter
	 */

	@Test
	public void test1() {
		int[] arr = { 2, 5, 8, 9, 10, 55, 77 };
		int temp = BinarySearch.recursiveBinarySearch(arr, 0, 7, 88);
		assertEquals("correct", -1, temp);
	}

}
