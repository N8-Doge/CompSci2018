

/**
 * The test class DivisibilityTest.
 *
 * @author  
 * @version 
 */
public class DivisibilityTest extends junit.framework.TestCase
{

	public void testDivisibility01()
	{
		String problemMsg="Problem with: testDivisibility01";

		Divisibility divide = new Divisibility(10);
		
		String[] numbers = {"17", "5", "-21", "15"};

	  assertEquals(problemMsg, true, divide.getResult(numbers, "7"));
	  assertEquals(problemMsg, false, divide.getResult(numbers, "5"));
/* replacement code for the two assertEquals given above */      
		if(!divide.getResult(numbers, "7"))
           System.out.println(problemMsg);
		if(divide.getResult(numbers, "5"))
           System.out.println(problemMsg);
	}
}