package Exercise2;

class Square extends Rectangle {

    public Square(double side) {
        super(side, side); // Call superclass Rectangle(double, double)
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side); // double set agar nilai tetap sama
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side); // double set agar nilai tetap sama
    }

    @Override
    public String toString() {
        return "A Square with side = " + getSide() + ", which is a subclass of " + super.toString();
    }
}