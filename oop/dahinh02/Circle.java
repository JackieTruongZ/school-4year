
public class Circle extends Shape {
    protected Point center;
    protected double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled) {
        super(color, filled);
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(Point center, double radius, String color, boolean filled) {
        super(color, filled);
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * 3.14;
    }

    @Override
    public double getPerimeter() {
        return radius * 2 * 3.14;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle other = (Circle) o;
        return this.center.equals(other.center) && Double.compare(radius, other.radius) == 0;
    }

    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(radius);
        result = 31 * center.hashCode() + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String TypeShape() {
        return "Circle";
    }

    @Override
    public String toString() {
        return "Circle[" + "center=" + this.center.toString()
                + ",radius=" + this.radius
                + ",color=" + super.color
                + ",filled=" + super.filled + "]";
    }
}
