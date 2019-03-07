import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * Display12 isa JPanel with 25 buttons in an array
 * 
 * @author      Nathan Chen
 * @version     3-7-19
 * @teacher     Coglianese
 * @period      2
 */
public class Display12 extends JPanel
{
    //Instance variables
    private JButton[] button;
    
    /**
     * Creates a new Display12 using a provided ActionListener
     * 
     * @param       lis     ActionListener for the 25 buttons
     */
    public Display12(ActionListener lis)
    {
        setLayout(new GridLayout(5, 5, 5, 5));

        button = new JButton[25];
        for(int x = 0; x < 25; x++)
        {
            button[x] = new JButton("" + (x + 1));
            button[x].addActionListener(lis);
            button[x].setHorizontalAlignment(SwingConstants.CENTER);
            button[x].setFont(new Font("Serif", Font.BOLD, 20));
            button[x].setBackground(Color.yellow);
            add(button[x]);
        }
    }

    /**
     * Resets the buttons in the array
     */
    public void reset()
    {
        for(int x = 0; x < 25; x++)
        {
            button[x].setBackground(Color.yellow);
            button[x].setEnabled(true);
            button[x].setText(""+(x+1));
        }
    }

    /**
     * Makes target button green and the rest gray and disables them
     * 
     * @param       target      Int for button to be green
     */
    public void displayWinner(int target)
    {
        for(int x = 0; x < 25; x++)
        {
            button[x].setBackground(Color.gray);
            button[x].setEnabled(false);
            button[x].setText("");
        }
        button[target-1].setText(""+target);
        button[target-1].setBackground(Color.green);
    }

    /**
     * Makes all the buttons red and target black and disables them
     * 
     * @param       target      Int for button that is black
     */
    public void displayLoser(int target)
    {
        for(int x = 0; x < 25; x++)
        {
            button[x].setBackground(Color.red);
            button[x].setEnabled(false);
            button[x].setText("");
        }
        button[target-1].setText("" + target);
        button[target-1].setBackground(Color.black);;
    }

    /**
     * Disables the buttons from the last to the one guessed, makes them red
     * 
     * @param       guess       Int for button guessed
     */
    public void displayTooHigh(int guess)
    {
        for(int x = button.length-1; x >= guess-1; x--){
            button[x].setBackground(Color.red);
            button[x].setText("");
            button[x].setEnabled(false);
        }
    }

    /**
     * Disables the buttons from the start to the one guessed, makes them red
     * 
     * @param       guess       Int for button guessed
     */
    public void displayTooLow(int guess)
    {
        for(int x = 0; x < guess; x++){
            button[x].setBackground(Color.red);
            button[x].setText("");
            button[x].setEnabled(false);
        }
    }
}