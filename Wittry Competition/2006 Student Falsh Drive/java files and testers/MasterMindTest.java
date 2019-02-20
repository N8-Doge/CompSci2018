

/**
 * The test class MasterMindTest.
 *
 * @author  
 * @version 
 */
public class MasterMindTest extends junit.framework.TestCase
{
	public void testMasterMind01()
	{
		String problemMsg="Problem with: testMasterMind01";
		MasterMind mm = new MasterMind("RBGW");
		assertEquals(problemMsg, 2, mm.getCorrectColorIncorrectLocation("WRPY"));
        assertEquals(problemMsg, 0, mm.getCorrectColorIncorrectLocation("WBPW"));
		assertEquals(problemMsg, 0, mm.getCorrectColorCorrectLocation("WRPY"));
		assertEquals(problemMsg, 2, mm.getCorrectColorCorrectLocation("WBPW"));
		assertEquals(problemMsg, false, mm.isCorrect("WRPY"));
		assertEquals(problemMsg, true, mm.isCorrect("RBGW"));
/* replacement code for the six assertEquals given above */      
		if(!(2 == mm.getCorrectColorIncorrectLocation("WRPY")))
           System.out.println(problemMsg);
		if(!(0 == mm.getCorrectColorIncorrectLocation("WBPW")))
           System.out.println(problemMsg);
		if(!(0 == mm.getCorrectColorCorrectLocation("WRPY")))
           System.out.println(problemMsg);
		if(!(2 == mm.getCorrectColorCorrectLocation("WBPW")))
           System.out.println(problemMsg);
		if(mm.isCorrect("WRPY"))
           System.out.println(problemMsg);
		if(!mm.isCorrect("RBGW"))
           System.out.println(problemMsg);
	}
}
