import java.util.ArrayList;

public class ReadingList
{
    private ArrayList<Book> books;

    public ReadingList()
    {
       books = new ArrayList<>();
    }

    public void addBook(Book book)
    {
        books.add(book);
    }

    public int getBookCount()
    {
       return books.size(); 

    }
}