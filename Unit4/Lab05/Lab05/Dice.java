/**
 * @author      Nathan Chen
 * @teacher     Coglianese
 * @version     #-##-19
 * @period      2
 * 
 * A virtual pair of dice
 */
public class Dice
{
    private int myOne, myTwo;
    /**
     * Default constructor for Dice sets instance vars
     */
    public Dice(){
        myOne = random();
        myTwo = random();
    }

    /**
     * Give instance variables new values
     */
    public void roll(){
        myOne = random();
        myTwo = random();
    }

    /**
     * Returns total of instance variables
     * 
     * @return    int    Total of dice
     */
    public int total(){
        return myOne + myTwo;
    }
    
    /**
     * Returns if the two dice are the same
     * 
     * @return    boolean   If the two dice are equal
     */
    public boolean doubles(){
        return (myOne==myTwo);
    }

    /**
     * Returns string for the two dice
     * 
     * @return    String    Interpretation of dice
     */
    public String toString(){
        return "{" + myOne + ", " + myTwo + "}";
    }

    /**
     * Give a random integer between 1 and 6
     * 
     * @return    int    Value between 1 and 6
     */
    private int random(){
        return (int)(Math.random() * 6 + 1);
    }
}