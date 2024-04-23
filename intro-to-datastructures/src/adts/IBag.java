package adts;

public interface IBag<T>
{
    /**
     * Adds an element to the bag if there is space
     * @param toAdd the element
     * @return true if the element was added, or false otherwise
     */
    boolean add(T toAdd);
    boolean contains(T searchFor);
    int size();
    int capacity();
    boolean isEmpty();
    boolean remove(T searchFor);
    void clear();
}
