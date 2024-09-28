package Exercise1;

public class Cylinder extends Circle { // Save as "Cylinder.java"
    private double height;

    public Cylinder() {
        super();
        height = 1.0;
    }

    // Constructor with default radius, color but given height
    public Cylinder(double height) {
        super(); // call superclass no-arg constructor Circle()
        this.height = height;
    }

    // Constructor with default color, but given radius, height
    public Cylinder(double radius, double height) {
        super(radius); // call superclass constructor Circle(r)
        this.height = height;
    }

    // A public method for retrieving the height
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // A public method for computing the volume of cylinder
    // use superclass method getArea() to get the base area
    /** Menggunakan override untuk mengakses method getArea() dari class Circle */
    @Override
    public double getArea() {
        return 2 * Math.PI * getRadius() * height + 2 * super.getArea(); // Menggunakan super.getArea()
    }

    public double getVolume() {
        return super.getArea() * height; // Menggunakan super.getArea()
    }

    @Override
    public String toString() { // in Cylinder class
        return "Cylinder: subclass of " + super.toString() // use Circle's toString()
                + " height = " + height;
    }
}

