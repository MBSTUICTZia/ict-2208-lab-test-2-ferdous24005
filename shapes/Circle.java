package shapes;
public class Circle extends Shape {
    private double radius;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return String.format("[ Circle ]\n" +
                "Color : %s\n" +
                "Filled: %s\n" +
                "Radius: %.1f\n" +
                "Area         : %.2f\n" +
                "Circumference: %.2f",
                color, filled ? "Yes" : "No", radius, getArea(), getPerimeter());
    }
}
