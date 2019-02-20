

/**
 * The test class SmithNumberTest.
 *
 * @author  
 * @version 
 */
public class TheTaskMasterTest extends junit.framework.TestCase
{

	public void testTheTaskMaster01()
	{
		String problemMsg="Problem with: testSmithNumber01";
// first example
		TheTaskMaster ttm = new TheTaskMaster(2);
		int[] tasks = {5, 2, 3, 5, 2};
		assertEquals(problemMsg, 9, ttm.findMinTime(tasks));
/* replacement code for the assertEquals given above */      
		if(!(9 == ttm.findMinTime(tasks)))
           System.out.println(problemMsg);

// another example
		ttm = new TheTaskMaster(2);
		int[] tasks1 = {10, 20, 40, 1};
		assertEquals(problemMsg, 40, ttm.findMinTime(tasks1));
/* replacement code for the assertEquals given above */      
		if(!(40 == ttm.findMinTime(tasks1)))
           System.out.println(problemMsg);

// one final example
		ttm = new TheTaskMaster(3);
		int[] tasks2 = {11, 20, 20, 12};
		assertEquals(problemMsg, 23, ttm.findMinTime(tasks2));
/* replacement code for the assertEquals given above */      
		if(!(23 == ttm.findMinTime(tasks2)))
           System.out.println(problemMsg);
	}
}
