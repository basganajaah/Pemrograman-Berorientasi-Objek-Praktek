abstract public class Shape {
    protected String shapeName;

    public Shape (String name) {
        shapeName = name;
    }

    abstract public double area();

    public String toString() {
        return shapeName;
    }
}
