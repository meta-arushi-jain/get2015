/*----checking for test cases
*/

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class PrintPyramid {

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
		String space=Assignment1.spaces(3,5);
		assertEquals("correct"," ",space);
		}
	
	
        @Test
        public void test1() 
        {
	
	   String num=Assignment1.numbers(3,5);
	   assertEquals("correct","1234321",num);

        }

        @Test
        public void test2()
         {
         	String []expected={"    1","   121","  12321"," 1234321","123454321"," 1234321","  12321","   121","    1"};
                String s1[]=Assignment1.printWholePyramid(5);
                       for(int i=0;i<5;i++)
                        {
                          assertEquals("correct",expected[i],s1[i]);
                         }
          }


}
