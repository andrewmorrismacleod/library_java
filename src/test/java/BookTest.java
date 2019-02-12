import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before(){
        book = new Book("The Name of the Rose", "Umberto Eco", "Mystery");
    }

    @Test
    public void hasTitle(){
        assertEquals("The Name of the Rose",book.getTitle());
    }

    @Test
    public void hasAuthor(){
        assertEquals("Umberto Eco",book.getAuthor());
    }

    @Test
    public void hasGenre(){
        assertEquals("Mystery",book.getGenre());
    }

}
