import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> books;

    public Borrower(){
        this.books = new ArrayList<>();
    }

    public ArrayList<Book> getBooks(){
        return this.books;
    }

    public void borrowBook(Library library){
        if (library.libraryHasBooks()) {
            this.books.add(library.lendBook());
        }
    }

}
