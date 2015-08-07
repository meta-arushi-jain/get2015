

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Fcfs {

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
		int arrival[]={1,5,9,25};
		int jobsize[]={12,7,2,5};
		int assumed[][]={{1,1,0,1,12},{2,5,8,13,19},{3,9,11,20,21},{4,25,0,25,29}};
		int finalResult[][]=Assignment4.FCFS(arrival,jobsize,jobsize.length);
		for(int i=0;i<arrival.length;i++){
				assertArrayEquals(assumed[i],finalResult[i]);	
		}
	}

}
