/*----checking for test cases
*/


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class Assignment2Pyramid {

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
		String space=Assignment2.spaces(3,5);
		assertEquals("correct","  ",space);
         }
	
	
        @Test
        public void test1() 
        {
	
	     String num=Assignment2.numbers(1,5);
	     assertEquals("correct","1",num);

         }
         
         
        @Test
        public void test2()
        {
            String expected[]={"12345"," 1234","  123","   12","    1"};
            String s1[]=Assignment2.printWholePyramid(5);
                    
                  for(int i=0;i<5;i++)
                     {
                       assertEquals("correct",expected[i],s1[i]);
	             }
         }
}

