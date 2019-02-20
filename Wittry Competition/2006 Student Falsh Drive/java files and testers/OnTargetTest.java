import java.util.*;

/**
 * The test class OnTargetTest.
 *
 * @author  
 * @version 
 */
public class OnTargetTest extends junit.framework.TestCase
{

	public void testOnTarget01()
	{
		String problemMsg="Problem with: testOnTarget01";
        ArrayList dataField = new ArrayList();
        int[] row1 = {1, 0, 0, 0, 0, 1, 1, 0};
        int[] row2 = {1, 0, 1, 1, 0, 1, 0, 0};
        int[] row3 = {0, 0, 0, 1, 0, 1, 0, 1};
        int[] row4 = {1, 1, 0, 1, 0, 1, 0, 0};
        int[] row5 = {1, 1, 0, 0, 0, 1, 1, 0};
        dataField.add(row1);
        dataField.add(row2);
        dataField.add(row3);
        dataField.add(row4);
        dataField.add(row5);
		OnTarget ot = new OnTarget(dataField);
		assertEquals(problemMsg, 5, ot.numTargets());
/* replacement code for the assertEquals given above */      
		if(!(5 == ot.numTargets()))
           System.out.println(problemMsg);
	}
}