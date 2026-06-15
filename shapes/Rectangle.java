package shapes;
public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return String.format("[ Rectangle ]\n" +
                "Color : %s\n" +
                "Filled: %s\n" +
                "Width : %.1f\n" +
                "Length: %.1f\n" +
                "Area      : %.2f\n" +
                "Perimeter : %.2f",
                color, filled ? "Yes" : "No", width, length, getArea(), getPerimeter());
    }
}
