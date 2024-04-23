package structure;

import adts.ISet;

/**
 * This structure mirrors the mathematical set.
 * It does not allow duplicates...
 *
 * @author ???
 * @version ???
 */
public class ArraySet implements ISet
{
    private Object[] data;

    public ArraySet()
    {

    }

    @Override
    public void add(Object element)
    {

    }

    @Override
    public void addAll(Object... elements)
    {

    }

    @Override
    public void remove(Object element)
    {

    }

    @Override
    public boolean contains(Object element)
    {
        return false;
    }

    @Override
    public int size()
    {
        return 0;
    }

    @Override
    public boolean isEmpty()
    {
        return false;
    }

    @Override
    public void clear()
    {

    }

    @Override
    public void removeAll(Object... elements)
    {

    }

    @Override
    public int capacity()
    {
        return 0;
    }
}

