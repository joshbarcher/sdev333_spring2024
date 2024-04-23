package lists;

import java.util.Iterator;

public class LinkedList<T> implements IList<T>, Iterable<T>
{
    private Node head;
    private Node tail;
    private int size;

    @Override
    public void add(T element) {
        //first node in the list?
        if (head == null) {
            head = tail = new Node(element);
        } else {
            //there are nodes in the list
            tail.next = new Node(element);
            tail = tail.next;
        }

        size++;
    }

    @Override
    public boolean contains(T element) {
        Node current = head;
        while (current != null) {
            //does the current node have the element we are
            //looking for?
            if (current.data.equals(element)) {
                return true; //found it!
            }

            //move to the next node
            current = current.next;
        }
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean remove(T element) {
        return false;
    }

    @Override
    public String toString() {
        Node current = head;
        String result = "";

        while (current != null) {
            result += current.data + " -> ";
            current = current.next;
        }

        return result + "null";
    }

    @Override
    public Iterator<T> iterator() {
        return new LLIterator();
    }

    private class LLIterator implements Iterator<T> {
        private Node current = head;

        public boolean hasNext() {
            return current != null;
        }

        public T next() {
            T saved = current.data; //save our result
            current = current.next; //move to the next element
            return saved;
        }
    }

    private class Node {
        private T data;
        private Node next;

        public Node(T data) {
            this.data = data;
        }

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
