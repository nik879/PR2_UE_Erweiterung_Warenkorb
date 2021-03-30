import java.util.Comparator;

public class AvgAmountPerItemAscComparator implements Comparator<Cart> {
    @Override
    public int compare(Cart o1, Cart o2) {
        double o1avgamountpItem = o1.getTotaltamount() / (double) o1.getTotalitems();
        double o2avgamountpItem = o2.getTotaltamount() / (double) o2.getTotalitems();
        if (o1avgamountpItem > o2avgamountpItem) return 1;
        if (o1avgamountpItem<o2avgamountpItem) return -1;
        return 0;
    }
}
