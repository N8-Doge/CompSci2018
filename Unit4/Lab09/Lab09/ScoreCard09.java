import javax.swing.*;
import java.awt.*;
/**
 * ScoreCard09 is for Display09 to score a golf game
 * 
 * @author      Nathan Chen
 * @version     3-1-19
 * @teacher     Coglianese
 * @period      2
 */
public class ScoreCard09 extends JPanel
{
    //Instance Variables
    private JTextField[] input;
    
    /**
     * Default constructor
     */
    public ScoreCard09(){
        setLayout(new GridLayout(2, 18));

        for(int x = 1; x <= 18; x++)
        {
            add(new JLabel("" + x, SwingConstants.CENTER));
        }

        input = new JTextField[18];
        for(int x = 0; x < input.length; x++)
        {
            input[x] = new JTextField();
            add(input[x]);
        }
    }

    /**
     * Randomizes the scores
     */
    public void randomize(){
        for(int x = 0; x < input.length; x++)
        {
            input[x].setText(""+randInt());
        }
    }

    /**
     * Returns total of scores as an integer
     */
    public int findTotal(){
        int total=0;
        for(int x = 0; x < input.length; x++)
            total+=Integer.parseInt(input[x].getText());
        return total;
    }

    /**
     * Finds the number of hole in ones as an integer
     */
    public int findAces()
    {
        int total=0;
        for(int x = 0; x < input.length; x++)
            if(Integer.parseInt(input[x].getText())==1)
                total++;
        return total+1;
    }

    /**
     * Returns the hole with the highest number as an integer 
     * If more than one have the same score, returns the first
     */
    public int findHardestHole(){
        int hardestIndex=0;
        int hardest=0;
        for(int x = 0; x < input.length; x++){
            int value = Integer.parseInt(input[x].getText());
            if(value>hardest){
                hardest=value;
                hardestIndex=x;
            }
        }
        return hardestIndex+1;
    }

    /**
     * Helper method for getting a random integer between 1 and 4
     */
    public int randInt(){
        return (int) (Math.random()*4)+1;
    }
}