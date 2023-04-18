package guru.springframework.model;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class CategoryTest extends TestCase {

    Category category;

    @Before
    public void setUp() {
        category = new Category();
    }

    @Test
    public void testGetId() {
        Long testValue = 3L;
        category.setId(testValue);
        assertEquals(category.getId(), testValue);
    }

    @Test
    public void testGetDescription() {
    }

    @Test
    public void testGetRecipes() {
    }
}