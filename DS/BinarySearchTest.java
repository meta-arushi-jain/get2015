import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class BinarySearchTest {
	BinarySearchOperation function= new BinarySearchOperation();

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
	@Test
	public void testCase1() {

		int arr[] = {1,1,1,2,3};
		int index = function.binarySearch(arr, 0, 4, 1);
		int left = function.getLeftMostOccurence(arr,0,index,1);
		int right = function.getRightMostOccurence(arr,index,5,1);
		assertEquals(2,index);
		assertEquals(left, 0);
		assertEquals(right, 2);
		}
	@Test
	public void testCase2() {

		int arr[] = {1,1,1,2,3};
		int index = function.binarySearch(arr, 0, 4, 5);
		assertEquals(-1,index);
		}
	@Test
	public void testCase3() {

		int arr[] = {1,1,1,2,3};
		int index = function.binarySearch(arr, 0, 4, 1);
		int left = function.getLeftMostOccurence(arr,0,index,1);
		int right = function.getRightMostOccurence(arr,index,5,1);
		assertNotEquals(3,index);
		assertNotEquals(left, 1);
		assertNotEquals(right, 4);
		}
	@Test
	public void testCase4() {

		int arr[] = new int[5];
		int index = function.binarySearch(arr, 0, 4, 5);
		assertEquals(-1,index);
		}
	
}
