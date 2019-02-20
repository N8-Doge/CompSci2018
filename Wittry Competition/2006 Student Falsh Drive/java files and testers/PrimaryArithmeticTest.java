

/**
 * The test class PrimaryArithmeticTest.
 *
 * @author  
 * @version 
 */
public class PrimaryArithmeticTest extends junit.framework.TestCase
{
	public void testPrimaryArithmetic01()
	{
		String problemMsg="Problem with: testPrimaryArithmetic01";
		int base = 10;
		String num1 = ""+123;
		String num2 = ""+457;
		//               580
		String[] numbers = {num1, num2};
		PrimaryArithmetic pa = new PrimaryArithmetic(base);
		assertEquals(problemMsg, 1, pa.getResults(numbers));
/* replacement code for the assertEquals given above */      
		if(!(1 == pa.getResults(numbers)))
           System.out.println(problemMsg);

		int base5 = 5;
		String num5_1 = ""+423;
		String num5_2 = ""+420;
		String num5_3 = ""+322;
		//                2220
		String[] numbers5 = {num5_1, num5_2, num5_3};
		PrimaryArithmetic pa5 = new PrimaryArithmetic(base5);
		assertEquals(problemMsg, 4, pa5.getResults(numbers5));
/* replacement code for the assertEquals given above */      
		if(!(4 == pa5.getResults(numbers5)))
           System.out.println(problemMsg);
	}
}
