import java.util.Objects;

public class Cart implements Comparable<Cart> {
    private String username;
    private int numArticles;
    private int totalitems;
    double totaltamount;

    public Cart(String username, int numArticles, int totalitems, double totaltamount) {
        this.username = username;
        this.numArticles = numArticles;
        this.totalitems = totalitems;
        this.totaltamount = totaltamount;
    }

    public String getUsername() {
        return username;
    }

    public int getNumArticles() {
        return numArticles;
    }

    public int getTotalitems() {
        return totalitems;
    }

    public double getTotaltamount() {
        return totaltamount;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setNumArticles(int numArticles) {
        this.numArticles = numArticles;
    }

    public void setTotalitems(int totalitems) {
        this.totalitems = totalitems;
    }

    public void setTotaltamount(double totaltamount) {
        this.totaltamount = totaltamount;
    }

    @Override
    public String toString() {
        return "\n"+"Cart{" +
                "username='" + username + '\'' +
                ", numArticles=" + numArticles +
                ", totalitems=" + totalitems +
                ", totaltamount=" + totaltamount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cart cart = (Cart) o;
        return numArticles == cart.numArticles && totalitems == cart.totalitems && Double.compare(cart.totaltamount, totaltamount) == 0 && Objects.equals(username, cart.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, numArticles, totalitems, totaltamount);
    }

    @Override
    public int compareTo(Cart o) {
        if (this.totaltamount > o.totaltamount) return -1;
        if (this.totaltamount < o.totaltamount) return 1;
        return 0;
    }
}
