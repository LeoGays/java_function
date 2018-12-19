public class ExpFunc extends Function{

    private double a;
    private double b;

    public ExpFunc(double a, double b, double leftBorder, double rightBorder) {
        super(leftBorder, rightBorder);
        setA(a);
        setB(b);
    }
    @Override
    public double funcValueCalc(double x) {
        return a*Math.exp(x) + b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }


}
