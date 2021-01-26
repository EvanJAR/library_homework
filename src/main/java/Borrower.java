import java.util.ArrayList;

public class Borrower {

    ArrayList<Book> collection;
    String name;

    public Borrower(String name){
        this.name = name;
        this.collection = new ArrayList<>();
    }

    public int collectionCount(){
        return this.collection.size();
    }

    public void addToCollection(Book removedBook) {
        this.collection.add(removedBook);
    }
}
