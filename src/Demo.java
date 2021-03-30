import java.util.ArrayList;
import java.util.Collections;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Cart> carts = new ArrayList<>();
        carts.add(new Cart("Alpha", 2, 15, 510));
        carts.add(new Cart("Beta", 4, 11, 180));
        carts.add(new Cart("Charly", 6, 26, 1230));

        System.out.println("Unsortiert \n"+carts);

        Collections.sort(carts);

        System.out.println("Sortiert nach totalamount mit Comparable \n"+carts);

        Collections.sort(carts,new CartusernameComparator());

        System.out.println("Sortiert nach username mit Comparator \n"+carts);

        Collections.sort(carts,new Carttotalitemscomparator());

        System.out.println("Sortiert nach totalitems mit Comparator \n"+carts);

    }
}
