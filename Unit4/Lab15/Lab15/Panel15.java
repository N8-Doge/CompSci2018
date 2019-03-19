import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * Panel15 hasa Gameboard15 and Scoreboard15 that connects them to play TicTacToe
 * 
 * @author      Nathan Chen
 * @version     3-10-19
 * @period      2
 * @teacher     Coglianese
 */
public class Panel15 extends JPanel
{
    //Instance variables
    private Scoreboard15 scoreboard;
    private Gameboard15 gameboard;
    private JButton reset;
    private JLabel label;
    
    /**
     * Default constructor creates a Panel15
     */
    public Panel15()
    {
        setLayout(new BorderLayout());

        scoreboard = new Scoreboard15();
        add(scoreboard, BorderLayout.NORTH);

        gameboard = new Gameboard15(new Callback());
        add(gameboard, BorderLayout.CENTER);

        JPanel south = new JPanel();
        south.setLayout(new FlowLayout());
        south.setBackground(Color.black);
        add(south, BorderLayout.SOUTH);

        reset = new JButton("Reset");
        reset.addActionListener(new Listener());
        reset.setFocusPainted(false);
        reset.setEnabled(false);
        south.add(reset);

        label = new JLabel("");
        label.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 18));
        label.setForeground(Color.yellow);
        south.add(label);
    }
    private class Callback implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if(gameboard.winner())
            {
                scoreboard.winner();
                gameboard.freeze();
                reset.setEnabled(true);
                label.setText("Winner!");
            }
            else if(gameboard.filled())
            {
                scoreboard.tie();
                reset.setEnabled(true);
                label.setText("Cat!");
            }
            else
            {
                scoreboard.toggle();
            }
        }
    }
    private class Listener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            gameboard.reset();
            reset.setEnabled(false);
            label.setText("");
            scoreboard.toggle();
        }
    }
}