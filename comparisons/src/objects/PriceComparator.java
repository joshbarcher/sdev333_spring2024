package objects;

import java.util.Comparator;

public class PriceComparator implements Comparator<Shoe> {
    public int compare(Shoe shoe1, Shoe shoe2) {
        return shoe1.getPrice() - shoe2.getPrice();
    }
}
