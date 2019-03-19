public class ByTotalSales implements java.util.Comparator<Salesperson>
{
    public int compare(Salesperson arg1, Salesperson arg2)
    {
        return arg1.getTotal() - arg2.getTotal();
    }
}