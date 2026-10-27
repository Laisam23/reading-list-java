public class Main
{
    public static void main(String[] args)
    {
        ReadingList readinglist = new ReadingList();
        Book book = new Book("IT", "Stephen King");

        readinglist.addBook(book);

        System.out.println(readinglist.getBookCount());
    }
}
