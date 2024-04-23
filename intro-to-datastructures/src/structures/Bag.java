package structures;

import adts.IBag;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

public class Bag<T> implements IBag<T>, Iterable<T> {
    private T[] data;
    private int size;

    //this tracks the number of changes to the bag
    private int modCount;

    public Bag(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException(
                "Bad bag capacity: " + capacity);
        }

        data = (T[]) new Object[capacity];
    }

    @Override
    public boolean add(T toAdd) {
        //is the bag full?
        if (size == data.length) {
            return false;
        }

        data[size] = toAdd;

        //move to the next unused index in the array
        size++;
        modCount++;
        return true;
    }

    @Override
    public boolean contains(T searchFor) {
        //only check the used side of our array
        for (int i = 0; i < size; i++) {
            if (data[i].equals(searchFor)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int capacity() {
        return data.length;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean remove(T searchFor) {
        if (!contains(searchFor)) {
            return false;
        }

        //search for the element
        for (int i = 0; i < size; i++) {
            if (data[i].equals(searchFor)) {
                //shift accordingly
                for (int j = i + 1; j < size; j++) {
                    data[j - 1] = data[j];
                }
                data[size - 1] = null;
                size--;
                modCount++;
                return true; //found it!
            }
        }

        return false; //not found!
    }

    @Override
    public void clear()
    {
        //data = new Object[data.length];
        size = 0;
        modCount++;
    }

    @Override
    public String toString()
    {
        return "Bag: " + Arrays.toString(data);
    }

    @Override
    public Iterator<T> iterator() {
        return new BagIterator();
    }

    private class BagIterator implements Iterator<T> {
        private int index = 0;
        private int savedModCount = modCount;

        @Override
        public boolean hasNext() {
            checkConcurrentActions();
            return index < data.length;
        }

        private void checkConcurrentActions() {
            if (savedModCount != modCount) {
                throw new ConcurrentModificationException(
                        "Can't change the bag while iterating!");
            }
        }

        @Override
        public T next() {
            checkConcurrentActions();
            return data[index++];
        }
    }
}
