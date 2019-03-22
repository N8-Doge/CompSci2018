public class ByUserName implements java.util.Comparator<EMail>
{
    public int compare(EMail arg1, EMail arg2){
        return arg1.getUserName().compareTo(arg2.getUserName());
    }
}
