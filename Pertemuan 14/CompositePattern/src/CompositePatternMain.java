public class CompositePatternMain {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        CompositeShape compositeShape = new CompositeShape();
        compositeShape.addShape(circle);
        compositeShape.addShape(rectangle);

        System.out.println("Menambahkan shape Circle dan Rectangle:");
        compositeShape.draw();

        System.out.println("\nMenghapus shape Circle");
        compositeShape.removeShape(circle);
        compositeShape.draw();
    }
}
