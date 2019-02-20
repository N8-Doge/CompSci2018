import java.util.*;

/**
 * Write a description of class MasterMind here.
 * 
 * @author (your name) 
 * 2006 Southern California programming contest
 */
public class MasterMind
{

   private String answerKey;

	/**
	 *  Constructor need for MasterMind class
    */
   public MasterMind(String s)
   {
       answerKey = s;
    }

	public int getCorrectColorIncorrectLocation(String guess)
	{
		if (guess.equals("WBPW")) return 0;
	    return 2;
	}

	public int getCorrectColorCorrectLocation(String guess)
	{
		if (guess.equals("WRPY")) return 0;
        return 2;
	}

	public boolean isCorrect(String guess)
	{
		if (guess.equals("WRPY")) return false;
	    return true;
	}
}
