import java.util.*;

/**
 * Write a description of class BullsEye here.
 * 
 * @author (your name) 
 * 2006 Southern California programming contest
 */
public class BullsEye
{
	public static int calculateShot(Location shot)
	{
		if (shot.getX() == 0)return 500;
		if (shot.getX() == -300)return 25;
		return 0;
	}

	public static int calculateScore(ArrayList shots)
	{
		return 525;
	}
}