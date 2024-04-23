package examples;

import java.util.Iterator;

public class Bag<T> implements Iterable<T> {
    private T[] data;

    //...more stuff here...

    @Override
    public Iterator<T> iterator() {
        return new BagIterator();
    }

    private class BagIterator implements Iterator<T> {

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public T next() {
            return null;
        }
    }
}
