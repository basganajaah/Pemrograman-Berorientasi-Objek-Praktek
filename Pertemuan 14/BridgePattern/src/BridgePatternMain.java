public class BridgePatternMain {
    public static void main(String[] args) {
        Shape circle1 = new Circle(5, 10, 15, new DrawingTypeOne());
        Shape circle2 = new Circle(10, 20, 30, new DrawingTypeTwo());

        circle1.draw();
        circle2.draw();
    }
}