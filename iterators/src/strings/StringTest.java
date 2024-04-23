package strings;

import java.util.Iterator;

public class StringTest {
    public static void main(String[] args) {
        MyString string = new MyString("Hello, world, how are you?");

        for (char chr : string) {
            System.out.println(chr);
        }

        Iterator<Character> iter = string.iterator();
        while (iter.hasNext()) {
            char chr = iter.next();
            System.out.println(chr);
        }
    }
}
