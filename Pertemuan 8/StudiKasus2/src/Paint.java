public class Paint {
    private final double coverage;

    public Paint (double cover) {
        coverage = cover;
    }

    public double amount (Shape s) {
        System.out.println("Computing amount for " + s);
        return s.area() / coverage;
    }
}
