

/**
 * The test class AnanagramsTest.
 *
 * @author  
 * @version 
 */
public class AnanagramsTest extends junit.framework.TestCase
{

	public void testAnanagrams01()
	{
		String problemMsg="Problem with: testAnanagrams01";
		String[] wordList = { "ladder", "came", "tape", "soon", "leader", "acme",
		                      "RIDE", "lone", "Dries", "peat", "Scale", "obR", 
		                      "eye", "Rides", "dealer", "NotE", "derail", "LaCes",
		                      "drIed", "noel", "dire", "Disk", "mace", "Rob", 
		                      "dries", "i"};
		Ananagrams an = new Ananagrams(wordList);
		String[] answer = {"Disk", "NotE", "derail", "drIed", "eye", "i",
		                    "ladder", "soon"};
		String[] anResults = an.getResult();
		for(int word = 0; word < answer.length; word++)
		{
		   assertEquals(problemMsg, answer[word], anResults[word]);
/* replacement if statement for the  assertEquals  given above */   
		   if(!answer[word].equals(anResults[word]))
		      System.out.println(problemMsg);
		}

	    assertEquals(problemMsg, answer.length, anResults.length);
/* replacement if statement for the assertEquals  given above */   
        if(!(answer.length == anResults.length))
		   System.out.println(problemMsg);

	}
}
