
public class Circle {
    private double radius;
    private String color;
    protected static final double PI = 3.14159;

    // Các phương thức khởi tạo
    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;

    }
    
    /** phương thuc khoi tao co tham so.
    * radius : double
    * color : String
    */
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;

    }

    // Các phương thức get set
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Phương thức get Area
    public double getArea() {
        return PI * radius * radius;
    }

    public String toString() {
        return "Circle[radius=" + radius + ",color=" + color + "]";
    }
}
