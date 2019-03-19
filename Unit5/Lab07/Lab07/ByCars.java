public class ByCars implements java.util.Comparator<Salesperson>
{
    public int compare(Salesperson arg1, Salesperson arg2)
    {
        return arg1.getCars() - arg2.getCars();
    }
}