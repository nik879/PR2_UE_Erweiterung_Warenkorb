import java.util.Comparator;

public class UsernameDescTotalAmountAscComparator implements Comparator<Cart> {
    @Override
    public int compare(Cart o1, Cart o2) {

        int cmpusername = o2.getUsername().compareTo(o1.getUsername());
        if (cmpusername == 0) {
            if (o1.getTotaltamount()>o2.getTotaltamount()) {
                return 1;
            }if (o1.getTotaltamount()<o2.getTotaltamount()) {
                return -1;
            }
        }
        return cmpusername;
    }
}
