public class RationalFunc extends Function {

    private double a;
    private double b;
    private double c;
    private double d;

    public RationalFunc(double a, double b, double c, double d, double leftBorder, double rightBorder) {
        super(leftBorder, rightBorder);
        setA(a);
        setB(b);
        setC(c);
        setD(d);
    }

    @Override
    public double funcValueCalc(double x) {
        try {
            return (a * x + b) / (c * x + d);
        } catch (ArithmeticException ex){
            throw new ArithmeticException("Division dy zero");
        }
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void setD(double d) {
        this.d = d;
    }
}

