package test;

import hashtables.HashTable;

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
    }
}
