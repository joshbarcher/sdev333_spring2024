package test;

import lists.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        String[] names = {"Bob", "Josie", "Sam", "Tad"};

        LinkedList<String> list = new LinkedList<>();
        for (String name : names) {
            list.add(name);
        }
        System.out.println(list);

        System.out.println(list.contains("Josie"));
        System.out.println(list.contains("Millie"));

        for (String name : list) {
            System.out.println(name);
        }
    }
}
