package range;

import java.util.Iterator;

public class Range implements Iterable<Integer> {
    private int low;
    private int high;

    public Range(int low, int high) {
        if (low > high) {
            swap(low, high);
        }

        this.low = low;
        this.high = high;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RangeIterator(this);
    }

    private void swap(int low, int high) {
        int temp = low;
        this.low = high;
        this.high = temp;
    }

    public int getLow() {
        return low;
    }

    public int getHigh() {
        return high;
    }

    public String toString() {
        return "[" + low + ", " + high + "]";
    }
}