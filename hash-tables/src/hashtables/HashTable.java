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

        //get a hash code
        int code = element.hashCode();
        int index = Math.abs(code) % table.length;

        while (table[index] != null) {
            System.out.println("Collision!");
            index = (index + 1) % table.length;
        }
        table[index] = element;
        size++;

        return false;
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
        return false;
    }

    @Override
    public boolean remove(T element) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {

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
