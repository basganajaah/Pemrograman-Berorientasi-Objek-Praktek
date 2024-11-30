class Shape implements Prototype {
    private final String type;
    private String color;

    public Shape(String type, String color) {
        this.type = type;
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public Prototype clone() {
        return new Shape(this.type, this.color);
    }

    @Override
    public String toString() {
        return "Shape [type = " + type + ", color = " + color + "]";
    }
}