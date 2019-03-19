import javax.swing.JFrame;
/**
 * Runs Unit4, Lab15: TicTacToe
 * 
 * @author      Torbert
 * @author      Nathan Chen
 * @period      2
 * @teacher     Coglianese
 * @version     3-10-19
 */
public class Driver15
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Unit4, Lab15: TicTacToe");
        frame.setSize(320, 320);
        frame.setLocation(200, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new Panel15());
        frame.setVisible(true);
    }
}