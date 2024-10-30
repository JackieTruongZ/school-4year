

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Layer {
    private List<Shape> shapes;

    public void addShape(Shape shape) {
        this.shapes.add(shape);
    }

    public void removeCircles() {

        this.shapes.removeIf(shape -> shape.TypeShape().equals("Circle"));
    }

    public String getInfo() {
        StringBuilder resultGetInfor = new StringBuilder();
        resultGetInfor.append("Layer of crazy shapes: \n");
        for (Shape iShape : shapes) {
            resultGetInfor.append(iShape.toString()).append("\n");
        }
        return resultGetInfor.toString();
    }

    public void removeDuplicates() {
        Set<Shape> uniqueShapes = new HashSet<>();
        uniqueShapes.addAll(shapes);
        shapes.clear();
        shapes.addAll(uniqueShapes);
    }
}
