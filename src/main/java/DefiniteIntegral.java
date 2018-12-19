public class DefiniteIntegral <T extends Function> implements Functional<T> {

    @Override
    public double getValue(T t) {
        final int N = 30;
        double integral = 0;
        double lengthSegment = (t.getRightBorder() - t.getLeftBorder()) / N;
        double leftborder = t.getLeftBorder();
        for (int i = 0; i < N ; i++) {
            integral += t.funcValueCalc(leftborder + lengthSegment * (i + 0.5));
        }

        integral *= lengthSegment;

        return integral;

    }

}
