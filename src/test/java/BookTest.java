import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BookTest {

    private Book book;

    @Before
    public void before(){
        book = new Book("On Beauty", "Zadie Smith", "Literary Fiction");
    }

    @Test
    public void hasTitle(){
        Assert.assertEquals("On Beauty", book.getTitle());
    }

    @Test
    public void hasAuthor(){
        Assert.assertEquals("Zadie Smith", book.getAuthor());
    }

    @Test
    public void hasGenre(){
        Assert.assertEquals("Literary Fiction", book.getGenre());
    }

}
