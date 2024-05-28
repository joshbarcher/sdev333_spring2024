package hashtables;

import java.util.Arrays;
import java.util.Iterator;

public class HashTable<T> implements ITable<T> {
    private static final double MAX_LF = 0.7;
    private static final int INIT_CAP = 10;
    private static final int RESIZE_RATE = 2;

    private T[] table;
    private int size;

    public HashTable() {
        table = (T[])new Object[INIT_CAP];
    }

    @Override
    public boolean add(T element) {
        double currentLF = (double)size / table.length;
        if (currentLF >= MAX_LF) {
            resize();
        }

        int index = getIndex(element);

        while (table[index] != null) {
            System.out.println("Collision!");
            index = (index + 1) % table.length;
        }
        table[index] = element;
        size++;

        return false;
    }

    private int getIndex(T element) {
        int code = element.hashCode();
        return Math.abs(code) % table.length;
    }

    private void resize() {
        //create a larger array
        T[] oldTable = table;
        table =  (T[])new Object[table.length * RESIZE_RATE];

        //rehash all elements in the table
        size = 0; //reset the size before rehashing
        for (int i = 0; i < oldTable.length; i++) {
            if (oldTable[i] != null) {
                add(oldTable[i]);
            }
        }
    }

    @Override
    public boolean contains(T element) {
        int index = getIndex(element);

        //why a loop?
        while (table[index] != null && !table[index].equals(element)) {
            index = (index + 1) % table.length;
        }

        //what now?
        if (table[index] == null) {
            return false;
        }
        return true;
    }

    @Override
    public boolean remove(T element) {
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        table = (T[])new Object[INIT_CAP];
        size = 0;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public String toString() {
        return Arrays.toString(table);
    }
}
