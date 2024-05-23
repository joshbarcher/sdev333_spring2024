package hashtables;

public interface ITable<T> extends Iterable<T> {
    boolean add(T element);
    boolean contains(T element);
    boolean remove(T element);

    int size();
    boolean isEmpty();
    void clear();
}
