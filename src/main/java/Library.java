import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private int capacity;

    public Library(){
        this.books = new ArrayList<>();
        this.capacity = 2;
    }

    public int bookCount(){
        return this.books.size();
    }

    public void addBook(Book book) {
       if(bookCount() < capacity){
           this.books.add(book);
       }
    }
}
