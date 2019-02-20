

/**
 * The test class SmithNumberTest.
 *
 * @author  
 * @version 
 */
public class SmithNumberTest extends junit.framework.TestCase
{

	public void testSmithNumber01()
	{
		String problemMsg="Problem with: testSmithNumber01";
		SmithNumber sn = new SmithNumber();
		assertEquals(problemMsg, 4937775, sn.findSmallestSmithNumberStrictlyGreaterThan(4937774));
/* replacement code for the assertEquals given above */      
		if(!(4937775 == sn.findSmallestSmithNumberStrictlyGreaterThan(4937774)))
           System.out.println(problemMsg);
	}
}
