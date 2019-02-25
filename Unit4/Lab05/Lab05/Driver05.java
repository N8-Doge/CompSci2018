/**
 * @author      Nathan Chen
 * @teacher     Coglianese
 * @version     2-25-19
 * @period      2
 * 
 * Performs program according to Lab05 by rolling dice
 */
public class Driver05
{
    //Instance Variables
    public static final int TRIALS = 100;
    public static int count;
    
    /**
     * Main executes upon run, calculates dice experiments
     * 
     * @param    args    For jar
     */
    public static void main(String[] args)
    {
        Dice d = new Dice();
        // Experiment  1
        count = 0;
        do
        {
            d.roll();
            count++;
        }while(d.total() != 12);
        System.out.println("It took " + count + " rolls to get boxcars.");

        // Experiment  2
        count = 0;
        do
        {
            d.roll();
            count++;
        }while(!d.doubles());
        System.out.println("It took " + count + " rolls to get doubles: " + d.toString());

        // Experiment  3
        count = 0;
        int[] array = new int[13];
        for(int i = 0; i<TRIALS; i++){
            d.roll();
            if(d.doubles()){
                count++;
            }
            array[d.total()]++;
        }
        for(int i = 2; i<=12; i++){
            System.out.println(""+i+"'s:  " + array[i]);
        }
        System.out.println("Number of doubles in 100 rolls: " + count);
    }
}