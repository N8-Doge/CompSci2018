public class Salesperson 
{
    //data fields
    private String myName;
    private int myCars, myTrucks;
    
    //constructors
    /**
     * Constructor for name and 0 cars/trucks
     * 
     * @param   name    Name of salesperson as String
     */
    public Salesperson(String name){
        myName=name;
        myCars=myTrucks=0;
    }
    /**
     * Constructor for name and with cars/trucks
     * 
     * @param   name    Name of salesperson as String
     * @param   cars    Number of cars as int
     * @param   trucks  Number of trucks as int
     */
    public Salesperson(String name, int cars, int trucks){
        myName=name;
        myCars=cars;
        myTrucks=trucks;
    }
    
    //other methods: toString
    /**
     * Gets string representation of class
     * 
     * @return  Formatted String representation of class
     */
    public String toString(){
        String s = myName+"\t";
        s+=Integer.toString(myCars)+"\t";
        s+=Integer.toString(myTrucks)+"\t";
        s+=Integer.toString(getTotal());
        return s;
    }
    
    //accessors and modifiers
    /**
     * Accessor method for name
     * 
     * @return  Name as String
     */
    public String getName(){return myName;}
    /**
     * Accessor method for cars
     * 
     * @return  Number of cars as int
     */
    public int getCars(){return myCars;}
    /**
     * Accessor method for trucks
     * 
     * @return  Number of trucks as int
     */
    public int getTrucks(){return myTrucks;}
    /**
     * Accessor method for total cars and trucks
     * 
     * @return  Number of trucks and cars as int
     */
    public int getTotal(){return myCars+myTrucks;}
    /**
     * Modifier method for name
     * 
     * @param   name    Name as a String
     */
    public void setName(String name){myName=name;}
    /**
     * Modifier method for cars
     * 
     * @param   cars    Number of cars as int
     */
    public void setCars(int cars){myCars=cars;}
    /**
     * Modifier method for trucks
     * 
     * @param   trucks  Number of trucks as int
     */
    public void setTrucks(int trucks){myTrucks=trucks;}
}