import org.junit.Before;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before(){
        library = new Library();
        book = new Book("On Beauty", "Zadie Smith", "Literary Fiction");
    }

}
