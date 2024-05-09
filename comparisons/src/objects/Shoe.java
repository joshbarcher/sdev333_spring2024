package objects;

public class Shoe /*implements Comparable<Shoe>*/ {
    //attributes?
    private double size;
    private String color;
    private int price;

    public Shoe(double size, String color, int price) {
        this.size = size;
        this.color = color;
        this.price = price;
    }

/*    @Override
    public int compareTo(Shoe other) {
        //first sort by size...
        if (this.size < other.size) {
            return -1;
        } else if (this.size > other.size) {
            return 1;
        }

        //multi-sort!
        return this.color.compareTo(other.color);
    }*/

    public double getSize() {
        return size;
    }
    public String getColor() {
        return color;
    }
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Shoe{" +
                "size=" + size +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
