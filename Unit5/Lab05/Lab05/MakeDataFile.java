import java.io.*;
/**
 * Outputs random feet and inches to a file
 * 
 * @author  Nathan Chen
 * @teacher Coglianese
 * @version 3-20-19
 * @period  2
 */
public class MakeDataFile
{
    /**
     * Main executes upon run
     * 
     * @param   args    Ignore
     */
    public static void main(String[] args) throws Exception
    {
        PrintStream p = new PrintStream(System.out);
        System.setOut(new PrintStream(new FileOutputStream("data.txt")));
        int numitems = (int)(Math.random() * 25 + 50);
        System.out.println(numitems);
        for(int k = 0; k < numitems; k++)
        {
            System.out.println((int)(Math.random() * 50));
            System.out.println((int)(Math.random() * 12));
        }
        System.setOut(p);
    }
}