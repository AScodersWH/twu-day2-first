import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestForTestCircle {

    private TestCircle testCircle;

    @Before
    public void setUp(){
        testCircle = new TestCircle(2.0);
    }

    @Test
    public void should_get_area_correctly(){
        Double result = Math.PI*4;
        assertEquals(testCircle.countArea(),result);
    }

    @Test
    public void should_get_perimeter_correctly(){
        Double result = Math.PI*2*2;
        assertEquals(testCircle.countPerimeter(),result);
    }
}
