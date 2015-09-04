import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class SortSystemTest {
	SortSystemOperations sortOperations = new SortSystemOperations();
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
	 * for bubble sort
	 */
	@Test

	public void test() {
		int arr[]={12,13,3,21,25,1};
		int expected[]={1,3,12,13,21,25};
		int arrOutput[]=new int[6];
	 arrOutput=sortOperations.comparisonSorting(6, arrOutput, arr);
		assertArrayEquals(expected,arrOutput);
	
		
	}
	/**
	 * for quick sort
	 */
	@Test
	public void test1() {
		
		int arr[]={12,13,3,21,25,1,45,55,195,111,0};
		int expected[]={0,1,3,12,13,21,25,45,55,111,195};
		int arrOutput[]=new int[11];
		 arrOutput=sortOperations.comparisonSorting(11, arrOutput, arr);
		assertArrayEquals(expected,arrOutput);
	
		
	}
	/**
	 * for radix sort
	 */
	@Test
	public void test2() {
		int arr[]={12,13,3,21,25,1};
		int expected[]={1,3,12,13,21,25};
		int arrOutput[]=new int[6];
	 arrOutput=sortOperations.linearSorting( arrOutput, arr);
		assertArrayEquals(expected,arrOutput);
	
		
	}
	/**
	 * for counting sort
	 */
	@Test
	public void test3() {
		int arr[]={12,13,3,18,5,1};
		int expected[]={1,3,5,12,13,18};
		int arrOutput[]=new int[6];
	 arrOutput=sortOperations.linearSorting( arrOutput, arr);
		assertArrayEquals(expected,arrOutput);
	
		
	}
	

}
