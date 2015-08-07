/*----checking for test suit cases of all classes
*/
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({ checkSort.class, convertBinaryToOctal.class, Fcfs.class,
		JoinMerge.class, longestSequence.class, removeDuplicate.class })
public class AllTests 
{

}
