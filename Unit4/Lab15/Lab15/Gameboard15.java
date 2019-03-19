import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * Gameboard15 is where TicTacToe is played
 * 
 * @author      Nathan Chen
 * @teacher     Coglianese
 * @version     3-10-19
 * @period      2
 */
public class Gameboard15 extends JPanel
{
    //Instance variables
    private JButton[][] board;
    private String gamepiece;
    private Color color;
    private int count;
    
    /**
     * Constructor for Gameboard15 that uses ActionListeners for buttons
     * 
     * @param   a   ActionListener for button array
     */
    public Gameboard15(ActionListener a)
    {
        gamepiece = "X";
        color = Color.green;
        count = 0;

        setLayout(new GridLayout(3, 3));
        setBackground(Color.black);

        board = new JButton[3][3];
        for(int x = 0; x < 3; x++){
            for(int y = 0; y < 3; y++){
                board[x][y] = new JButton("-");
                board[x][y].setFont(new Font("Monospaced", Font.PLAIN, 20));
                board[x][y].setBackground(Color.white);
                board[x][y].setFocusPainted(false);
                board[x][y].addActionListener(a); // <---Add this one first!!!!!
                board[x][y].addActionListener(new Listener(x, y));
                add(board[x][y]);
            }
        }
    }
    private class Listener implements ActionListener
    {
        private int myX, myY;
        public Listener(int x, int y)
        {
            myX = x;
            myY = y;
        }

        public void actionPerformed(ActionEvent e)
        {
            board[myX][myY].setText(gamepiece);
            board[myX][myY].setBackground(color);
            board[myX][myY].setEnabled(false);
            if(gamepiece.equals("X")){
                gamepiece="O";
                color=Color.blue;
            }
            else{
                gamepiece="X";
                color=Color.green;
            }
            count++;
        }
    }
    
    /**
     * Freezes the board so that only reset can be called
     */
    public void freeze()
    {
        for(int x = 0; x < 3; x++){
            for(int y = 0; y < 3; y++){
                board[x][y].setEnabled(false);
            }
        }
    }

    /**
     * Resets the board so that game can be played
     */
    public void reset()
    {
        for(int x = 0; x < 3; x++){
            for(int y = 0; y < 3; y++){
                board[x][y].setText("-");
                board[x][y].setBackground(Color.white);
                board[x][y].setFocusPainted(false);
                board[x][y].setEnabled(true);
            }
        }
        count=0;
    }

    /**
     * Returns whether or not board is filled
     */
    public boolean filled()
    {
        return (count==9);
    }

    /**
     * Returns whether or not the game has a winner
     */
    public boolean winner()
    {
        for(int x = 0; x < 3; x++){
            int winX=0;
            int winO=0;
            for(int y = 0; y < 3; y++){
                if(board[x][y].getText().equals("X")){
                    winX++;
                }
                else if(board[x][y].getText().equals("O")){
                    winO++;
                }
            }
            if(winX==3|winO==3){
                return true;
            }
        }
        for(int x = 0; x < 3; x++){
            int winX=0;
            int winO=0;
            for(int y = 0; y < 3; y++){
                if(board[y][x].getText().equals("X")){
                    winX++;
                }
                else if(board[y][x].getText().equals("O")){
                    winO++;
                }
            }
            if(winX==3|winO==3){
                return true;
            }
        }
        int winX=0;
        int winO=0;
        for(int x = 0; x < 3; x++){
            if(board[x][x].getText().equals("X")){
                winX++;
            }
            else if(board[x][x].getText().equals("O")){
                winO++;
            }
            if(winX==3|winO==3){
                return true;
            }
        }
        winX=0;
        winO=0;
        for(int x = 0; x < 3; x++){
            if(board[x][2-x].getText().equals("X")){
                winX++;
            }
            else if(board[x][2-x].getText().equals("O")){
                winO++;
            }
            if(winX==3|winO==3){
                return true;
            }
        }
        return false;
    }
}