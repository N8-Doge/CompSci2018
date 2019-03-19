import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * Scoreboard15 counts and displays the wins for X and O and ties
 * 
 * @author      Nathan Chen
 * @version     3-10-19
 * @teacher     Coglianese
 * @period      2
 */
public class Scoreboard15 extends JPanel
{
    private JLabel labelX, labelC, labelO;
    private int winX, cat, winO;
    private String current;
    
    /**
     * Default constructor for Scoreboard15
     */
    public Scoreboard15()
    {
        winX = cat = winO = 0;
        current = "X";

        setLayout(new GridLayout(1, 9));
        setBackground(Color.black);

        add(new JLabel(""));
        labelX = new JLabel("X: 0", SwingConstants.CENTER);
        labelX.setOpaque(true);
        labelX.setBackground(Color.yellow);
        labelX.setForeground(Color.black);
        add(labelX);
        add(new JLabel(""));

        add(new JLabel(""));
        labelC = new JLabel("Cat: 0", SwingConstants.CENTER);
        labelC.setOpaque(true);
        labelC.setBackground(Color.black);
        labelC.setForeground(Color.white);
        add(labelC);
        add(new JLabel(""));

        add(new JLabel(""));
        labelO = new JLabel("O: 0", SwingConstants.CENTER);
        labelO.setOpaque(true);
        labelO.setBackground(Color.black);
        labelO.setForeground(Color.white);
        add(labelO);
        add(new JLabel(""));
    }

    /**
     * Toggles the indicator for whose turn it is
     */
    public void toggle()
    {
        labelC.setBackground(Color.black);
        labelC.setForeground(Color.white);
        if (current.equals("X"))
        {
            labelO.setBackground(Color.yellow);
            labelO.setForeground(Color.black);
            labelX.setBackground(Color.black);
            labelX.setForeground(Color.white);
            current = "O";
        }
        else
        {
            labelO.setBackground(Color.black);
            labelO.setForeground(Color.white);
            labelX.setBackground(Color.yellow);
            labelX.setForeground(Color.black);
            current = "X";
        }
    }

    /**
     * Increments the winner depending on toggle
     */
    public void winner()
    {
        if (current.equals("X"))
        {
            winX++;
            labelX.setText("X: " + winX);
        }
        else
        {
            winO++;
            labelO.setText("O: " + winO);
        }
    }

    /**
     * Increments tie and changes colors correspondingly
     */
    public void tie()
    {
        cat++;
        labelC.setText("Cat: " + cat);
        labelX.setBackground(Color.black);
        labelX.setForeground(Color.white);
        labelO.setBackground(Color.black);
        labelO.setForeground(Color.white);
        labelC.setBackground(Color.yellow);
        labelC.setForeground(Color.black);
    }
}