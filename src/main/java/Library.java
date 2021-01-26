import java.util.ArrayList;

public class Library {

    ArrayList<Book> books;
    int capacity;

    public Library(int capacity){
        this.books = new ArrayList<>();
        this.capacity = capacity;
    }

    public int countBooks(){
        return this.books.size();
    }

    public void addBook(Book book) {
        if (this.capacity > this.countBooks()){
            this.books.add(book);
        }
    }

    public int getCapacity() {
        return this.capacity;
    }

    public Book removeBook(Book book1) {
        int index = this.books.indexOf(book1);
        return this.books.remove(index);

    }
}
