/*----checking for test cases
*/
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class removeDuplicate {

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

			int array1[]={2,5,4,6,3,8,5,9,3,3,6,3,9,0};
			int[] array2=Assignment2.removeDuplicate(array1);
			int array3[]={2,5,4,6,3,8,9,0};
			assertArrayEquals("correct",array3,array2);
		
	}

}
