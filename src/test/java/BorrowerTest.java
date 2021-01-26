import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BorrowerTest {
    Library library;
    Borrower borrower;
    Book book1;
    Book book2;
    Book book3;

    @Before
    public void before(){
        borrower = new Borrower("Jim");
        library = new Library(10);
        book1 = new Book("On Beauty", "Zadie Smith", "Literary Fiction");
        book2 = new Book("Infinite Jest", "David Foster Wallace", "Literary Fiction");
        book3 = new Book("Game of Thrones", "George R. R. Martin", "Fantasy");
    }

    @Test
    public void collectionBeginsAtZero(){
        Assert.assertEquals(0, borrower.collectionCount());
    }

    @Test
    public void canAddBookToCollection(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        Book removedBook = library.removeBook(book1);
        borrower.addToCollection(removedBook);
        Assert.assertEquals(1, borrower.collectionCount());
        Assert.assertEquals(2, library.countBooks());
    }


}
