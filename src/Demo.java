import java.util.ArrayList;
import java.util.Collections;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Cart> carts = new ArrayList<>();
        carts.add(new Cart("Alpha", 2, 15, 510));
        carts.add(new Cart("Beta", 4, 11, 180));
        carts.add(new Cart("Charly", 6, 26, 1230));
        carts.add(new Cart("Delta", 6, 12, 3740));
        carts.add(new Cart("Delta", 8, 10, 6340));

        System.out.println("Unsortiert \n"+carts);

        Collections.sort(carts);

        System.out.println("Sortiert nach totalamount mit Comparable \n"+carts);

        Collections.sort(carts,new CartusernameComparator());

        System.out.println("Sortiert nach username mit Comparator \n"+carts);

        Collections.sort(carts,new Carttotalitemscomparator());

        System.out.println("Sortiert nach totalitems mit Comparator \n" + carts);

        Collections.sort(carts,new ArticlesDescItemsAscComparator());

        System.out.println("Sortiert nach Articles (abs.) & Items (auf.)  mit Comparator \n"+carts);

        Collections.sort(carts,new UsernameDescTotalAmountAscComparator());

        System.out.println("Sortiert nach Username (abs.) & Totalamount (auf.)  mit Comparator \n"+carts);

        Collections.sort(carts,new AvgAmountPerItemAscComparator());

        System.out.println("Sortiert nach dursch. Amount pro Item (auf.)  mit Comparator \n"+carts);

        Collections.sort(carts,new AvgAmountPerArticleDescComparator());

        System.out.println("Sortiert nach dursch. Amount pro Article (abs.)  mit Comparator \n"+carts);

    }
}
