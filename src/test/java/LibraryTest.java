import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public void before(){
        library = new Library();
        book1 = new Book("On Beauty", "Zadie Smith", "Literary Fiction");
        book2 = new Book("Infinite Jest", "David Foster Wallace", "Literary Fiction");
        book3 = new Book("Game of Thrones", "George R. R. Martin", "Fantasy");
    }

    @Test
    public void canCountBooks(){
        Assert.assertEquals(0, library.countBooks());
    }

    @Test
    public void canAddBook(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        Assert.assertEquals(3, library.countBooks());
    }

}
