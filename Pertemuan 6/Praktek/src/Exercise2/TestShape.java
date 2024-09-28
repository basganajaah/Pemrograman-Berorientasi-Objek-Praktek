package Exercise2;

public class TestShape {
    public static void main(String[] args) {
        // Test program untuk class Shape
        Shape shape1 = new Shape();
        System.out.println(shape1);
        Shape shape2 = new Shape("red", true);
        System.out.println(shape2);

        // Test program untuk class Circle
        Circle circle1 = new Circle();
        System.out.println(circle1);
        Circle circle2 = new Circle(2.0);
        System.out.println(circle2);
        Circle circle3 = new Circle(5.0, "blue", false);
        System.out.println(circle3);

        // Test program untuk class Rectangle
        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1);
        Rectangle rectangle2 = new Rectangle(2.0, 5.0);
        System.out.println(rectangle2);
        Rectangle rectangle3 = new Rectangle(2.0, 5.0, "yellow", false);
        System.out.println(rectangle3);

        // Test program untuk class Square
        Square square1 = new Square(2.0);
        System.out.println(square1);
        Square square2 = new Square(10.0, "red", true);
        System.out.println(square2);

        square1.setSide(5.0);
        System.out.println("Updated Square1 = " + square1);
        System.out.println("Area dari Square1 = " + square1.getArea());
        System.out.println("Perimeter dari Square1 = " + square1.getPerimeter());
    }
}
