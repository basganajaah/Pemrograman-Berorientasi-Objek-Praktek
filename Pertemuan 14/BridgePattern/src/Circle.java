class Circle extends Shape {
    private final int x;
    private final int y;
    private final int radius;
    public Circle(int x, int y, int radius, DrawingType drawingAPI) {
        super(drawingAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public void draw() {
        drawingAPI.drawCircle(x, y, radius);
    }
}