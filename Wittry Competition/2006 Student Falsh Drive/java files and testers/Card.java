/**
 *  Card class correctly implemented.
 * 
 * @author your friendly provider 
 * 2006 Southern California programming contest
 */
public class Card
{

	private String value;
	private String suit;

	public Card(String v, String s)
	{
    	value = v;
    	suit = s;
    }

	public String getValue()
	{
		return value;
	}

	public String getSuit()
	{
		return suit;
	}
}
