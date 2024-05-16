package test;

import trees.BinarySearchTree;

public class TestTree {
    public static void main(String[] args) {
        /*String[] words = {"was", "this", "and", "or", "but", "to"};

        BinarySearchTree<String> bst = new BinarySearchTree<>();

        for (String word : words) {
            bst.add(word);
        }
        System.out.println(bst);*/

        int[] elements = {90, 50, 110, 45, 80, 97, 130};
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        for (int num : elements) {
            bst.add(num);
        }
        System.out.println(bst);

        bst.add(93);
        System.out.println(bst);

        //poke the tree
        System.out.println(bst.contains(90));
        System.out.println(bst.contains(97));
        System.out.println(bst.contains(45));

        System.out.println(bst.contains(-10));
    }
}
