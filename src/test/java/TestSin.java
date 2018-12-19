import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSin {

    @Test
    public void testValue() {
        SinFunc f1 = new SinFunc(1,0,0,1);
        assertEquals(0.5, f1.funcValueCalc(Math.PI/6),0.01);
        SinFunc f2 = new SinFunc(1,-1,0,1);
        assertEquals(0, f2.funcValueCalc(Math.PI/2),0.01);
        SinFunc f3 = new SinFunc(1,1,0,1);
        assertEquals(2, f3.funcValueCalc(Math.PI/2),0.01);

    }
}
