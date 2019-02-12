import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
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
        borrower = new  Borrower();
        library = new Library();
    }

    @Test
    public void hasBooks(){
        library.addBookToLibrary(book1);
        library.addBookToLibrary(book2);
        library.addBookToLibrary(book3);
        library.addBookToLibrary(book4);
        borrower.borrowBook(library);
        borrower.borrowBook(library);
        borrower.borrowBook(library);
        assertEquals("The Name of the Rose",borrower.getBooks().get(0).getTitle());
        assertEquals("The Constant Suicides",borrower.getBooks().get(1).getTitle());
        assertEquals("The Murders in the Rue Morgue",borrower.getBooks().get(2).getTitle());
    }
    
}