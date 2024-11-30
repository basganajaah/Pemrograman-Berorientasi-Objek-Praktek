public class PrototypePatternMain {
    public static void main(String[] args) {
        ShapeRegistry registry = new ShapeRegistry();

        registry.registerShape("circle", new Shape("Circle", "Red"));
        registry.registerShape("square", new Shape("Square", "Blue"));

        Shape clonedCircle = registry.getShape("circle");
        clonedCircle.setColor("Green");

        Shape clonedSquare = registry.getShape("square");

        System.out.println(clonedCircle);
        System.out.println(clonedSquare);
    }
}