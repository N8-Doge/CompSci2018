

/**
 * The test class ErrantPhysicistTest.
 *
 * @author  
 * @version 
 */
public class ErrantPhysicistTest extends junit.framework.TestCase
{

	public void testErrantPhysicist01()
	{
		String problemMsg="Problem with: testErrantPhysicist01";
		String line1 = "  13 2     11      8      6    5     5 2     3    3       ";
		String line2 = "-x  y  -  x  y + 8x y + 9x  - x y + x y  + 8x  + x y - + y";
		String polynomial1 = "-yx8+9x3-1+y";
		String polynomial2 = "x5y+1+x3";
		String[] answer = ErrantPhysicist.getResult(polynomial1, polynomial2);
		assertEquals(problemMsg, line1, answer[0]);
		assertEquals(problemMsg, line2, answer[1]);
/* replacement code for the two assertEquals given above */      
		if(!line1.equals(answer[0]))
           System.out.println(problemMsg);
		if(!line2.equals(answer[1]))
           System.out.println(problemMsg);
	}
}
