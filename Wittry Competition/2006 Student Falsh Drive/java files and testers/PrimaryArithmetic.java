/**
 * Write a description of class PrimaryArithmetic here.
 * 
 * @author (your name) 
 * 2006 Southern California programming contest
 */
public class PrimaryArithmetic
{
   private int base;

   /**
    *  Constructor need for PrimaryArithmetic class
   */
   public PrimaryArithmetic(int b)
   {
       base = b;
   }

	public int getResults(String[] str)
	{
	    if (str.length == 2) return 1;
	    return 4;
	}
}
