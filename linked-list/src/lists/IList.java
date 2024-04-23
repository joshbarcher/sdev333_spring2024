package lists;

public interface IList<T>
{
    void add(T element);
    boolean remove(T element);
    boolean contains(T element);
    int size();
    boolean isEmpty();
}
