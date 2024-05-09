package test;

import objects.ColorComparator;
import objects.PriceComparator;
import objects.Shoe;

import java.util.Arrays;

public class TestShoes {
    public static void main(String[] args) {
        Shoe[] shoes = {
            new Shoe(9.5, "White", 95),
            new Shoe(10.0, "Brown", 130),
            new Shoe(8.0, "Grey", 105),
            new Shoe(10.0, "Blue", 90),
            new Shoe(8.0, "Purple", 140),
            new Shoe(8.0, "Pink", 85),
            new Shoe(11.0, "Turquoise", 80),
            new Shoe(9.5, "Red", 110),
            new Shoe(7.5, "Orange", 115),
            new Shoe(11.0, "Maroon", 135),
            new Shoe(7.5, "Yellow", 75),
            new Shoe(9.5, "Black", 100),
            new Shoe(10.0, "Green", 120),
            new Shoe(7.5, "Navy", 125),
            new Shoe(11.0, "Silver", 95)
        };

        PriceComparator comparator = new PriceComparator();
        ColorComparator otherComparator = new ColorComparator();
        Arrays.sort(shoes, otherComparator);

        for (Shoe shoe : shoes) {
            System.out.println(shoe);
        }
    }
}
