import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class JoinMerge {

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
		int array1[]={1,2,2,2,3,3};
		int array2[]={1,4,7,9};
		int array3[]=new int[array1.length+array2.length];
		Assignment6 assign1=new Assignment6();
		array3=assign1.join(array1,array1.length,array2,array2.length,array3);
		int array4[]={1,1,2,2,2,3,3,4,7,9};
		assertArrayEquals("correct",array4,array3);
	}

}
