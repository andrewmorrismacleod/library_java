import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private int capacity;
    private ArrayList<Book> books;
    private HashMap<String, Integer> countsByGenre;

    public Library(){
        this.capacity = 100;
        this.books = new ArrayList<>();
        this.countsByGenre = new HashMap<>();
    }

    public int getCapacity(){
        return this.capacity;
    }

    public HashMap<String, Integer> getGenreCounts(){
        return this.countsByGenre;
    }

    public int countBooksInLibrary(){
        return this.books.size();
    }

    public void addBookToLibrary(Book book){
        this.books.add(book);
    }

    public boolean canLibraryAddNewBook(){
        return countBooksInLibrary() < this.capacity;
    }

    public boolean libraryHasBooks(){
        return countBooksInLibrary() > 0;
    }

    public Book lendBook() {
        return this.books.remove(0);
    }

    public void countGenres(){
        for (Book book : this.books){
            String key = book.getGenre();
            try {
                this.countsByGenre.put(key, this.countsByGenre.get(key) + 1);
            }
            catch(Exception e) {
                this.countsByGenre.put(key, 1);
            }
        }
    }

}