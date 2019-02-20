

/**
 * The test class TexasHoldemTest.
 *
 * @author  
 * @version 
 */
public class TexasHoldemTest extends junit.framework.TestCase
{

	public void testTexasHoldem01()
	{
		String problemMsg="Problem with: testTexasHoldem01";
		Card card1 = new Card("2", "spade");
		Card card2 = new Card("4", "club");
		Card card3 = new Card("jack", "diamond");
		Card card4 = new Card("9", "heart");
		Card card5 = new Card("10", "spade");
        Card[] commonCards = {card1, card2, card3, card4, card5};
        Player p1 = new Player("A", new Card("7", "diamond"),
               /*  jack high  */    new Card("3", "club"));
        Player p2 = new Player("B", new Card("queen", "diamond"),
               /*  queen high  */   new Card("5", "heart"));
        Player p3 = new Player("winner", new Card("7", "heart"),
               /*  king high  */     new Card("king", "club"));    
        Player p4 = new Player("C", new Card("7", "spade"),
               /*  jack high  */    new Card("6", "club"));
        Player p5 = new Player("D", new Card("7", "club"),
               /*  jack high  */    new Card("5", "club"));
        Player[] ps = {p1, p2, p3, p4, p5};
		TexasHoldem th = new TexasHoldem(commonCards, ps);
		assertEquals(problemMsg, p3.getName(), th.getWinner());
/* replacement code for the assertEquals given above */      
		if(!p3.getName().equals(th.getWinner()))
           System.out.println(problemMsg);
	}
}
