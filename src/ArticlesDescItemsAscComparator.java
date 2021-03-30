import java.util.Comparator;

public class ArticlesDescItemsAscComparator implements Comparator<Cart> {
    @Override
    public int compare(Cart o1, Cart o2) {
        int cmpArticles = 0;
        if (o2.getNumArticles() > o1.getNumArticles()) cmpArticles = 1;
        if (o2.getNumArticles() < o1.getNumArticles()) cmpArticles = -1;
        if (cmpArticles == 0) {
            if (o1.getTotalitems() > o2.getTotalitems()) return 1;
            if (o1.getTotalitems() < o2.getTotalitems()) return -1;
        }
        return cmpArticles;
    }
}
