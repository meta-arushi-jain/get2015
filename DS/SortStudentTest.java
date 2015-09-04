import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SortStudentTest {
	TreeOperations tree = new TreeOperations();

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
	 * testing Sort tree
	 */
	@Test
	public void test() {

		Node root1 = null;
		root1 = tree.addInTree(root1, 1);
		root1 = tree.addInTree(root1, 1);
		root1 = tree.addInTree(root1, 1);
		root1 = tree.addInTree(root1, 1);
		root1 = tree.addInTree(root1, 1);
		root1 = tree.addInTree(root1, 1);

		assertEquals(" 1", tree.traverseInorder(root1));
	}

	/**
	 * testing Sort tree
	 */

	@Test
	public void test1() {

		Node root1 = null;
		root1 = tree.addInTree(root1, 1);
		root1 = tree.addInTree(root1, 2);
		root1 = tree.addInTree(root1, 5);
		root1 = tree.addInTree(root1, 4);
		root1 = tree.addInTree(root1, 3);
		root1 = tree.addInTree(root1, 6);

		assertEquals(" 1 2 3 4 5 6", tree.traverseInorder(root1));
	}

}
