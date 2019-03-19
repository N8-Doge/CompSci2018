public class Salesperson 
{
    //data fields
    private String myName;
    private int myCars, myTrucks;
    
    //constructors
    public Salesperson(){
        myName="";
        myCars=myTrucks=0;
    }
    public Salesperson(String name, int cars, int trucks){
        myName=name;
        myCars=cars;
        myTrucks=trucks;
    }
    
    //other methods: toString
    public String toString(){
        String s = myName+"\t";
        s+=Integer.toString(myCars)+"\t";
        s+=Integer.toString(myTrucks)+"\t";
        s+=Integer.toString(getTotal());
        return s;
    }
    
    //accessors and modifiers
    public String getName(){return myName;}
    public int getCars(){return myCars;}
    public int getTrucks(){return myTrucks;}
    public int getTotal(){return myCars+myTrucks;}
    public void setName(String name){myName=name;}
    public void setCars(int cars){myCars=cars;}
    public void setTrucks(int trucks){myTrucks=trucks;}
}