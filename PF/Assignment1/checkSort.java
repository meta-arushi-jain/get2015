import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class checkSort {

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
	public void test() {
		int array1[]={1,2,3,4,5};
		int b=Assignment5.checkSort(array1);
		
		assertEquals("correct",1,b);
		
	}
	@Test
	public void test1() {
		int array2[]={5,4,3,2,1};
		int b=Assignment5.checkSort(array2);
		
		assertEquals("correct",2,b);
		
	}
	@Test
	public void test2() {
		int array1[]={1,2,6,4,5};
		int b=Assignment5.checkSort(array1);
		
		assertEquals("correct",0,b);
		
	}

}
