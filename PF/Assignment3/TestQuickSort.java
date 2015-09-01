import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestQuickSort {

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
	public void test1() {
		int[] arr = { 2, 5, 8, 9, 10, 77, 55, 11 };
		int[] arr1 = { 2, 5, 8, 9, 10, 11, 55, 77 };
		int temp[] = QuickSort.sortArray(arr, 0, 7);
		assertArrayEquals("correct", arr1, temp);
	}

	@Test
	public void test2() {
		int[] arr = {};
		int[] arr1 = {};
		int temp[] = QuickSort.sortArray(arr, 0, 0);
		assertArrayEquals("correct", arr1, temp);
	}

}
