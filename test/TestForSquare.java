import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestForSquare {

    private Square square;

    @Before
    public void setUp(){
        square = new Square(2.0);
    }

    @Test
    public void should_get_area_correctly(){
        Double area = 2*2.0;
       assertEquals( square.countArea(),area);
    }

    @Test
    public void should_get_perimeter_correctly(){
        Double area = 4*2.0;
        assertEquals( square.countPerimeter(),area);
    }
}
