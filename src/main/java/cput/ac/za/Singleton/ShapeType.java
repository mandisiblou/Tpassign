package cput.ac.za.Singleton;

/**
 * Created by Mandisi on 4/1/2017.
 */
public class ShapeType {
    private static ShapeType shapeType = null;
    private ShapeType() {
    }
    public static ShapeType getInstance() {
        if (shapeType == null) {
            shapeType = new ShapeType();
        }
        return shapeType;
    }
    public void Circle() {
        System.out.println("This is a Motor Vehicle");
    }
    public void Rectangles() {
        System.out.println("This is a Student Vehicle");
    }
    public void Hexagon() {
        System.out.println("This is a Hexagon Vehicle");
    }
}
