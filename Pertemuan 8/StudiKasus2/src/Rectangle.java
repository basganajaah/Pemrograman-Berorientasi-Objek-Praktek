public class Rectangle extends Shape {
    private final double lengthRect;
    private final double widthRect;

    public Rectangle (double length, double width) {
        super("Rectangle");
        lengthRect = length;
        widthRect = width;
    }

    @Override
    public double area() {
        return lengthRect * widthRect;
    }

    @Override
    public String toString() {
        return super.toString() + " with length " + lengthRect + " and width " + widthRect;
    }
}
