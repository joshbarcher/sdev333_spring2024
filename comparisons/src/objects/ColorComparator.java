package objects;

import java.util.Comparator;

public class ColorComparator implements Comparator<Shoe> {
    public int compare(Shoe shoe1, Shoe shoe2) {
        return shoe1.getColor().compareTo(shoe2.getColor());
    }
}
