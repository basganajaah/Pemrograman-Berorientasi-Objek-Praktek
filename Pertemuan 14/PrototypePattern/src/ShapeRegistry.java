import java.util.HashMap;
import java.util.Map;

class ShapeRegistry {
    private final Map<String, Shape> shapes = new HashMap<>();

    public void registerShape(String key, Shape shape) {
        shapes.put(key, shape);
    }

    public Shape getShape(String key) {
        return (Shape) shapes.get(key).clone();
    }
}