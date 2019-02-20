import java.util.*;

/**
 * The test class BullsEyeTest.
 *
 * @author  
 * @version 
 */
public class BullsEyeTest extends junit.framework.TestCase
{

	public void testBullsEye01()
	{
		String problemMsg="Problem with: testBullsEye01";
		BullsEye be = new BullsEye();

		ArrayList shotLocations = new ArrayList();
		shotLocations.add(new Location(0, 1));        // score = 500
		shotLocations.add(new Location(-300, -290));  // score = 25
		shotLocations.add(new Location(725, 375));    // score = 0

		assertEquals(problemMsg, 500, be.calculateShot((Location)shotLocations.get(0)));
		assertEquals(problemMsg, 25, be.calculateShot((Location)shotLocations.get(1)));
		assertEquals(problemMsg, 0, be.calculateShot((Location)shotLocations.get(2)));
/* replacement code for the three assertEquals  given above */      
		if(!(500 == be.calculateShot((Location)shotLocations.get(0))))
           System.out.println(problemMsg);
		if(!(25 == be.calculateShot((Location)shotLocations.get(1))))
           System.out.println(problemMsg);
		if(!(0 == be.calculateShot((Location)shotLocations.get(2))))
           System.out.println(problemMsg);

		assertEquals(problemMsg, 525, be.calculateScore(shotLocations));
/* replacement code for the assertEquals given above */      
		if(!(525 == be.calculateScore(shotLocations)))
           System.out.println(problemMsg);
	}
}