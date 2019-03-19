public class ByName implements java.util.Comparator<Salesperson>
{
    public int compare(Salesperson arg1, Salesperson arg2)
    {
        return arg2.getName().compareTo(arg1.getName());
    }
}