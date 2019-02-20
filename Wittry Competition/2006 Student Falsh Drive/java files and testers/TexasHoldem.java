/**
 * Write a description of class TexasHoldem here.
 * 
 * @author (your name) 
 * 2006 Southern California programming contest
 */
public class TexasHoldem
{

   private Card[] cards;
   private Player[] players;

	/**
	 *  Constructor need for TexasHoldem class
	 */
   public TexasHoldem(Card[] cs, Player[] ps)
   {
       cards = cs;
       players = ps;
    }

	/**
	 * @param  y   
	 * @return     the name of the player with the winning hand
	 */
	public String getWinner()
	{
		// 
		return "winner";  // so it compiles
	}
}
