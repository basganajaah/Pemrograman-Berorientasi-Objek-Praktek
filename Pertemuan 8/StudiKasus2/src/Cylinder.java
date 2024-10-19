public class Cylinder extends Shape {
    private final double radiusCylinder;
    private final double heightCylinder;

    public Cylinder (double radius, double height) {
        super("Cylinder");
        radiusCylinder = radius;
        heightCylinder = height;
    }

    @Override
    public double area() {
        return Math.PI * (radiusCylinder * radiusCylinder) * heightCylinder;
    }

    @Override
    public String toString() {
        return super.toString() + " with radius " + radiusCylinder + " and height " + heightCylinder;
    }
}
