import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestRational {

    @Test
    public void testValue() {
        RationalFunc f1 = new RationalFunc(1,2,1,2,0,1);
        assertEquals(1,f1.funcValueCalc(1),0.0);
        RationalFunc f2 = new RationalFunc(1,1,1,2,0,1);
        assertEquals(0.5,f2.funcValueCalc(0),0.1);
        RationalFunc f3 = new RationalFunc(1,0,1,2,0,1);
        assertEquals(0.3333,f3.funcValueCalc(1),0.0001);
    }

}
