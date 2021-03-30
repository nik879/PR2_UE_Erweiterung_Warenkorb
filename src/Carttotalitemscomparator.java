import java.util.Comparator;

public class Carttotalitemscomparator implements Comparator<Cart> {



    @Override
    public int compare(Cart o1, Cart o2) {
        if (o1.getTotalitems()>o2.getTotalitems()) return 1;
        if (o1.getTotalitems()<o2.getTotalitems()) return -1;
        return 0;
    }
}
