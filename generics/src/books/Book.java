package books;

import java.time.LocalDate;

//Media is a parent of Book
public class Book<T extends Comparable> extends Media implements Comparable
{
    private String title;
    private LocalDate released;
    private String genre;
    private int pages;
    private T author;

    public Book(String title, LocalDate released, String genre,
                int pages, T author)
    {
        this.title = title;
        this.released = released;
        this.genre = genre;
        this.pages = pages;
        this.author = author;
    }

    @Override
    public int compareTo(Object o)
    {
        return 0;
    }

    public String getTitle()
    {
        return title;
    }

    public LocalDate getReleased()
    {
        return released;
    }

    public String getGenre()
    {
        return genre;
    }

    public int getPages()
    {
        return pages;
    }

    public T getAuthor()
    {
        return author;
    }
}
