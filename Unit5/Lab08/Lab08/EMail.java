public class EMail
{
    private String myUserName;
    private String myHostName;
    private String myExtension;
    public EMail(String address)
    {
        int at = address.indexOf("@");
        int dot = address.indexOf(".");
        myUserName=address.substring(0,at);
        myHostName=address.substring(at,dot);
        myExtension=address.substring(dot);
    }

    public String getUserName()
    {
        return myUserName;
    }

    public String getHostName()
    {
        return myHostName;
    }

    public String getExtension()
    {
        return myExtension;
    }

    public String toString()
    {
        return myUserName+"@"+myHostName+"."+myExtension;
    }
}