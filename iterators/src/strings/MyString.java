package strings;

import java.util.Iterator;

public class MyString implements Iterable<Character> {
    private String data;

    public MyString(String data) {
        this.data = data;
    }

    @Override
    public Iterator<Character> iterator() {
        return new MyStringIterator();
    }

    private class MyStringIterator implements Iterator<Character> {
        private int curStringIndex = 0;

        @Override
        public boolean hasNext() {
            return curStringIndex < data.length();
        }

        @Override
        public Character next() {
            if (!hasNext()) {
                throw new IllegalStateException("No more characters!");
            }

            char singleChar = data.charAt(curStringIndex);
            curStringIndex++;
            return singleChar;
        }
    }
}
