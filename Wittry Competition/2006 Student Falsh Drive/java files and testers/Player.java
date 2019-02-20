/**
 *  Player class correctly implemented.
 * 
 * @author your friendly provider 
 * 2006 Southern California programming contest
 */
public class Player
{
	private String name;
	private Card card1;
	private Card card2;

	public Player(String n, Card c1, Card c2)
	{
    	name = n;
    	card1 = c1;
    	card2 = c2;
    }

	public String getName()
	{
		return name;
	}

	public Card getCard1()
	{
		return card1;
	}

	public Card getCard2()
	{
		return card2;
	}
}
