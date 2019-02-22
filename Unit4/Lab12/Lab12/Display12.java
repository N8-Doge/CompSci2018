//Name______________________________ Date_____________
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Display12 extends JPanel
{
    private JButton[] button;
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

    public void reset()
    {
        for(int x = 0; x < 25; x++)
        {
            button[x].setBackground(Color.yellow);
            button[x].setEnabled(true);
            button[x].setText(""+(x+1));
        }
    }

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

    public void displayTooHigh(int guess)
    {
        for(int x = button.length-1; x >= guess-1; x--){
            button[x].setBackground(Color.red);
            button[x].setText("");
            button[x].setEnabled(false);
        }
    }

    public void displayTooLow(int guess)
    {
        for(int x = 0; x < guess; x++){
            button[x].setBackground(Color.red);
            button[x].setText("");
            button[x].setEnabled(false);
        }
    }
}