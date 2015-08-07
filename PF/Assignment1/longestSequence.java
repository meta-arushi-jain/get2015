/*----checking for test cases
*/
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class longestSequence {

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
	public void test() 
	{
		int array1[]={1,2,3,1,2};
		int[] array2=Assignment2.removeDuplicate(array1);
		int array3[]={1,2,3};
		assertArrayEquals("correct",array3,array2);
	
	}

}
