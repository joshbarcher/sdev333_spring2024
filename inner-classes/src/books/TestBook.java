package books;

public class TestBook {
    public static void main(String[] args) {
        Book.Author author = new Book.Author("JRR", "Tolkien");
        Book book = new Book("The Fellowship of the Ring", 600, author);

        System.out.println(book);
    }
}
