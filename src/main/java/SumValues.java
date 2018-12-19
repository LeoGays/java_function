public class SumValues <T extends Function> implements Functional<T> {

    @Override
    public double getValue ( T t) {
        return t.funcValueCalc(t.getLeftBorder()) + t.funcValueCalc(t.getRightBorder())
                + t.funcValueCalc((t.getRightBorder() + t.getLeftBorder()) * 0.5);
    }

}
