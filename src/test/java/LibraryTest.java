import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book1;
    Book book2;
    Book book3;
    Book book4;

    @Before
    public void before(){

        book1 = new Book("The Name of the Rose", "Umberto Eco", "Mystery");
        book2 = new Book("The Constant Suicides", "John Dickson Carr", "Mystery");
        book3 = new Book("The Murders in the Rue Morgue", "Edgar Allan Poe", "Mystery");
        book4 = new Book("A Brief History of Time", "Stephen Hawking", "Popular Science");
        library = new Library();
    }

    @Test
    public void hasCapacity(){
        assertEquals(100,library.getCapacity());
    }

    @Test
    public void canAddBook(){
        library.addBookToLibrary(book1);
        assertEquals(1,library.countBooksInLibrary());
    }

    @Test
    public void checkCapacity(){
        assertEquals(true,library.canLibraryAddNewBook());
    }

    @Test
    public void libraryHasBooks(){
        library.addBookToLibrary(book1);
        assertEquals(true,library.libraryHasBooks());
    }

    @Test
    public void canLendBook(){
        library.addBookToLibrary(book1);
        library.lendBook();
        assertEquals(0,library.countBooksInLibrary());
    }

    @Test
    public void hasHashMap(){
        library.addBookToLibrary(book1);
        library.addBookToLibrary(book2);
        library.addBookToLibrary(book3);
        library.addBookToLibrary(book4);
        library.countGenres();
        assertEquals(3,(int) library.getGenreCounts().get("Mystery"));
    }

}