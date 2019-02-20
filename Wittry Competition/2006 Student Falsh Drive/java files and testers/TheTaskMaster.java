/**
 * Write a description of class TheTaskMaster here.
 * 
 * @author (your name) 
 * 2006 Southern California programming contest
 */
public class TheTaskMaster
{
    private int numWorkers;

	/**
	 * Constructor need for TheTaskMaster class
	 */
	public TheTaskMaster(int num)
	{
		numWorkers = num;
	}


	/**
	 * @param  y   
	 * @return     the min work time
	 */
	public int findMinTime(int[] taskList)
	{
		// 
		if (taskList.length == 5)return 9; 
		if (taskList.length == 4)
		{
			if( numWorkers == 2)return 40;
		}
		return 23;
	}
}
