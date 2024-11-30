abstract class Shape {
    protected DrawingType drawingAPI;
    public Shape(DrawingType drawingAPI) {
        this.drawingAPI = drawingAPI;
    }
    public abstract void draw();
}