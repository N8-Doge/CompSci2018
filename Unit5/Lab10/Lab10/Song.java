public class Song implements Comparable<Song>{
    //data fields
    private String myTitle;
    private int myMinutes, mySeconds;

    //constructors
    public Song(String s){
        int col = s.indexOf(":");
        int spa = s.indexOf(" ");
        myMinutes=Integer.parseInt(s.substring(0,col));
        myMinutes=Integer.parseInt(s.substring(col+1,spa));
        myTitle=s.substring(spa+1);
    }
    
    //methods
    public int compareTo(Song s){
        return (mySeconds+myMinutes*60)-(s.getSeconds()+myMinutes*60);
    }
    public boolean equals(Song s){
        return compareTo(s)==0;
    }
    public String toString(){
        return myTitle+" ("+myMinutes+"' "+mySeconds+"\")";
    }
    
    //class shit
    public void setTitle(String s){
        myTitle=s;
    }
    public void setMinutes(int m){
        myMinutes=m;
    }
    public void setSeconds(int s){
        mySeconds=s;
    }
    public String getTitle(){
        return myTitle;
    }
    public int getMinutes(){
        return myMinutes;
    }
    public int getSeconds(){
        return mySeconds;
    }
}