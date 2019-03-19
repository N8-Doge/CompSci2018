public class ByTrucks implements java.util.Comparator<Salesperson>
{
    public int compare(Salesperson arg1, Salesperson arg2)
    {
        return arg1.getTrucks() - arg2.getTrucks();
    }
}