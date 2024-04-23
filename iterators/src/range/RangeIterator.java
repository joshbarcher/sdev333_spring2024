package range;

import java.util.Iterator;

public class RangeIterator implements Iterator<Integer> {
    private Range range;

    //this holds the current number in the range
    private int currentNum;

    public RangeIterator(Range range) {
        this.range = range;

        //assign the first element to return
        currentNum = range.getLow();
    }

    @Override
    public boolean hasNext() {
        //make sure the number to return is in the range
        return currentNum >= range.getLow() &&
               currentNum <= range.getHigh();
    }

    @Override
    public Integer next() {
        //double check that there is something left
        if (!hasNext()) {
            throw new IllegalStateException("No more elements in the range");
        }

        int result = currentNum;
        currentNum++;
        return result;
    }
}
