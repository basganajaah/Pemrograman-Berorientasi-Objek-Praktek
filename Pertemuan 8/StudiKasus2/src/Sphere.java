public class Sphere extends Shape {
    private final double radius;

    public Sphere (double rad) {
        super("Sphere");
        radius = rad;
    }

    public double area() {
        return 4 * Math.PI * radius * radius;
    }

    public String toString() {
        return super.toString() + " of radius " + radius;
    }
}
