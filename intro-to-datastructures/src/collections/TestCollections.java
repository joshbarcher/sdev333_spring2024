package collections;

import java.util.*;

public class TestCollections {
    public static void main(String[] args) {
        //Collection<String> list = new ArrayList<>();
        List<String> list = new LinkedList<>();
        Collection<String> set = new HashSet<>();
        Collection<String> stack = new Stack<>();

        printElements(list);
        printElements(set);
        printElements(stack);

        list.add("hello");
        list.add("world");
        list.add(0, "!");

        System.out.println("Adding elements");
        for (int i = 0; i < 1000000; i++) {
            list.add(String.valueOf(i));
        }

        System.out.println("Accessing elements");
        for (int i = 0; i < list.size(); i++)
        {
            String element = list.get(i);
            //System.out.println(element);
        }
        System.out.println("Done");
    }

    private static void printElements(Collection<String> dataStructure) {
        for (String element : dataStructure) {
            System.out.println(element);
        }
    }
}
