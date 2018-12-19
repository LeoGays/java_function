import org.junit.Test;
import static org.junit.Assert.*;

public class TestLiner {

    @Test
    public void testValue() {
        LinerFunc f1 = new LinerFunc(1,2, 0,1);
        assertEquals(2, f1.funcValueCalc(0), 0.0);
        LinerFunc f2 = new LinerFunc(1,0, 0,1);
        assertEquals(5, f2.funcValueCalc(5), 0.0);
        LinerFunc f3 = new LinerFunc(2,2, 0,1);
        assertEquals(4, f3.funcValueCalc(1), 0.0);
    }


}
