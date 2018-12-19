import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestFunctionalSumValues {

    @Test
    public void testSumValues () {
        SumValues funk = new SumValues();
        ExpFunc f1 = new ExpFunc(0,1,0,1);
        LinerFunc f2 = new LinerFunc(1,2, 0,1);
        RationalFunc f3 = new RationalFunc(1,2,1,1,0,1);
        SinFunc f4 = new SinFunc(1,0,0,1);
        assertEquals(7.5, funk.getValue(f2), 0.001);
        assertEquals(5.16,funk.getValue(f3),0.01);
    }
}
