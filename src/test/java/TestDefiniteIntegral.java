import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDefiniteIntegral {

    @Test
    public void testValue () {
        DefiniteIntegral integral = new DefiniteIntegral();
        LinerFunc f1 = new LinerFunc(1,0, 0,6);
        assertEquals(18,integral.getValue(f1), 0.001);
    }

}
