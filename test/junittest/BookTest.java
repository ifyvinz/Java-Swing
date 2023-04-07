package junittest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import vincent.Book;

public class BookTest {
    Book bk = new Book("Jave", "TOM9S6", "Vincent");
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetId() {
		String expect = "TOM9S6";
		String real = bk.getId();
		assertEquals(expect, real);
		//fail("Not yet implemented");
		
	}

	@Test
	/*public void testSetAuthor() {
		
	}*/

	
	public void testr() {
		String expect = "Vincent";
		String real = bk.getAuthor();
		assertTrue(expect.equals(real));
		//fail("Not yet implemented");
	}

}
