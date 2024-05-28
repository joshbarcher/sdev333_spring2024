package test;

import hashtables.HashTable;

import java.util.HashSet;
import java.util.Iterator;

public class TestTable {
    public static void main(String[] args) {
        String[] fruit = {"raspberry", "grape", "pineapple", "apple",
                          "orange", "blueberry", "cherry", "raisin",
                          "coconut", "banana"};

        HashTable<String> table = new HashTable<>();
        for (String singleFruit : fruit) {
            table.add(singleFruit);
        }
        System.out.println(table);

        System.out.println(table.contains("grape"));
        System.out.println(table.contains("lime"));

        //print out elements (without toString())
        System.out.println();
        for (String item : table) {
            System.out.println(item);
        }
        System.out.println();

        Iterator<String> it = table.iterator();

        //no change should happen with the iterator
        it.hasNext();
        it.hasNext();
        it.hasNext();

        String first = it.next();
        System.out.println(first);
    }
}
