

public class Cylinder extends Circle {
    private double height;

    // Các phương thức khởi tạo
    public Cylinder() {
        super();

    }

    public Cylinder(double radius) {
        super(radius);

    }
    
    /** phuong thuc khoi tao co tham so.
    * Radius : double 
    * height : double 
    */
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    /** phuong thuc khoi tao co tham so.
    * Radius : double 
    * height : double 
    * color : String
    */
    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;

    }

    // Các phương thức get set

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Phương thức get Volume
    public double getVolume() {
        return getArea() * height;
    }

    // Phương thức get Area
    public double getArea() { // Diện tích xung quanh
        return 2 * PI * getRadius() * height;
    }

    @Override
    public String toString() {
        return "Cylinder[" + super.toString() + ",color=" + getColor() + "]";
    }
}

