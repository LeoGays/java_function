import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestExp {

    @Test
    public void testExp() {
        ExpFunc f1 = new ExpFunc(0,1,0,1);
        assertEquals(1, f1.funcValueCalc(1), 0.0);
        ExpFunc f2 = new ExpFunc(1,0, 0,1);
        assertEquals(Math.E,f2.funcValueCalc(1), 0.001);
        ExpFunc f3 = new ExpFunc(1,1,0,1);
        assertEquals(Math.E + 1, f3.funcValueCalc(1), 0.01);

    }

}
