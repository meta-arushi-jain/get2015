import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({ TestBinarySearch.class, TestGreatestCommonDivisor.class,
		TestLargestDigit.class, TestLinearSearch.class, TestQuickSort.class,
		TestRemainder.class })
public class AllTests {

}
