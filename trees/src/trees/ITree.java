package trees;

import java.util.List;

//type T will be Comparable (use the Comparable interface)
public interface ITree<T extends Comparable<T>> {
    //primary methods
    boolean add(T element);
    boolean contains(T element);
    boolean remove(T element);

    //common methods
    int size();
    boolean isEmpty();
    void clear();

    List<T> inOrder();
    List<T> preOrder();
    List<T> postOrder();

    //no concept of indices
    //T get(int index);
    //void set(int index, T element);
}
