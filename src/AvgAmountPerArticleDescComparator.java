import java.util.Comparator;

public class AvgAmountPerArticleDescComparator implements Comparator<Cart> {
    @Override
    public int compare(Cart o1, Cart o2) {
        double o1avgarticleamount = o1.getTotaltamount() / (double) o1.getNumArticles();
        double o2avgarticleamount = o2.getTotaltamount() / (double) o2.getNumArticles();
        return Double.compare(o2avgarticleamount, o1avgarticleamount);
    }
}
