import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestForRactangle {

    public Ractangle ractangle;

    @Before
    public void setUp() {
        ractangle = new Ractangle();
    }

    @Test
    public void should_get_area_correctly() {
        assertEquals(ractangle.countArea(2, 5), 10);
    }


    @Test
    public void should_get_perimeter_correctly() {
        assertEquals(ractangle.countPerimeter(2, 5), 14);
    }
}
